package com.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> arrayList =  Arrays.asList(10,20,30,20,50,60,40,30,70,80);

        System.out.println(arrayList);

        HashSet hashSet = new HashSet(arrayList);

        System.out.println("After removing duplicates>>" +hashSet);





    }
}
