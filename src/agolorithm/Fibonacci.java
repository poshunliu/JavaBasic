package agolorithm;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

//
//        public int getFibonacciBtup(int index) {
//            int [] result = new int[index+1];
//            for (int i = 0; i < result.length; i++) {
//                if(i==0 || i==1){
//                    result[i] = 1;
//                }else{
//                    result[i] = result[i-1]+ result[i-2];
//                }
//            }
//            return result[index];
//        }
//
//    public static void main(String args[]){
//
//
//        Fibonacci fibonacci = new Fibonacci();
//        int lastNum = fibonacci.getFibonacciBtup(5);
//        System.out.println(lastNum);
//
//    }



//    //recursive method
//    public int getFibonacci(int n){
//
//        if(n == 0)
//            return 0;
//        else if(n == 1)
//            return 1;
//        else
//            return getFibonacci(n - 1) + getFibonacci(n - 2);
//    }

//
//
    //recursive with memo

    public int getFibonacci(int n, int[] memo) {

        if (n == 0) {
            memo[0] = 1;
            return 1;
        } else if(n == 1){
            memo[1] = 1;
            return 1;
        } else{
            n = getFibonacci(n - 1, memo) + getFibonacci(n - 2,memo) ;
            memo[n] = (n - 1) + (n - 2);
            return n;
        }




    }}
