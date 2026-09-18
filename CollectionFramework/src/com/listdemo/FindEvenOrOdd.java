package com.listdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class FindEvenOrOdd {

    public static void main(String[] args) {


       ArrayList<Integer> arrayList = (ArrayList) Arrays.asList(10,15,12,11,44,55,66,77);

       for (int i: arrayList){

           if (i%2==0){
               System.out.println("Number is even>>" +i);
           }
           else {
               System.out.println("Number is odd>>" +i);
           }

       }



    }
}
