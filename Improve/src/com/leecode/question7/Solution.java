package com.leecode.question7;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/6 下午2:35
 */
class Solution {
    public int reverse(int x) {
        boolean num = true;
        if(x < 0){
            num = false;
        }

        String value = String.valueOf(Math.abs(x));
        StringBuilder result = new StringBuilder();
        for (int i = value.length()-1; i >= 0 ; i--) {
            result.append(value.charAt(i));
        }
        return num? Integer.parseInt(result.toString()) : -Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-321));
    }
}
