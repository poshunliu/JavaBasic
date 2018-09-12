package agolorithm;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


    //button method

    public List<Integer> getTheNum(){

        int a = 0;
        int b = 1;
        int num[] = {1,1,2,3,5,8,13,21,34,55};



        List<Integer> list = new ArrayList<>();

        for(int i=0; i< num.length; i++){
            int c = a + b;
            a = b;
            b = c;

            list.add(c);
        }
        return list;
    }

    public static void main(String args[]){


        Fibonacci fibonacci = new Fibonacci();
        List lastNum = fibonacci.getTheNum();
        System.out.println(lastNum);

    }


    //recursive method
    public int fibonacci(int n){

        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }



    //recursive with memo

    public int fibonacci(int n, int memo){

        if(n == 0){
            return 0;
        }else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1, memo) + fibonacci(n-2, memo);

    }

}
