package com.steve.bitmap;

import java.util.BitSet;
import java.util.Random;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/12/26 下午5:52
 */
public class Test {

    @org.junit.Test
    public void test1(){

        int num = 1000;
        int[] array = new int[num];
        BitSet bitSet  = new BitSet(num);

        Random random = new Random();
        for (int i = 0; i < num ; i++) {
            array[i] = random.nextInt(10000000);
        }
        

        for(int j = 0; j <array.length;  j++)
        {
            bitSet.set(array[j], true);
        }

        for (int k = 0 ; k < 10000000; k++){
            if (bitSet.get(k)){
                System.out.println(k);
            }
        }

    }
}
