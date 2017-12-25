package com.steve.jdbc;

import org.junit.Test;

import java.sql.*;
import java.util.Random;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/25 下午10:35
 */
public class OneMillionData {


    private final String url = "jdbc:mysql://localhost:3306/demo";
    private String user = "root";
    private String password = "123456";

    //事务提交
    //批处理操作

    @Test
    public void insertData() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO user(user_id, user_name, user_age) VALUES (?,?,?)";
            pstm = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            Long startTime = System.currentTimeMillis();
            Random rand = new Random();
            int a, b, c, d;
            for (int i = 1; i <= 1000000; i++) {
                pstm.setInt(1, i);
                pstm.setString(2,"user"+i);
                pstm.setInt(3,rand.nextInt(100));
                pstm.addBatch();
            }
            pstm.executeBatch();
            conn.commit();
            Long endTime = System.currentTimeMillis();
            System.out.println("OK,用时：" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
