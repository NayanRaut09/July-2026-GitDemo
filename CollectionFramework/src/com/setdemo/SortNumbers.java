package com.setdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SortNumbers {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(Arrays.asList(55,33,66,77,11,22,99,88));
        System.out.println("Before sorting>>" +arrayList);

        TreeSet treeSet = new TreeSet(arrayList);
        System.out.println("After sorting>>" +treeSet);


    }
}
