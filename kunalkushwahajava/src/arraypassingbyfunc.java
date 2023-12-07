package com.cpmpany;
import java.util.Arrays;
public class arraypassingbyfunc {
    public static void main(String[] args) {
        int[] nums= {1,76,7,9,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=43;
    }
}

