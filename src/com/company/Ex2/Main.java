package com.company.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to
A case-insensitive.*/

      List<String>nameList = new ArrayList<>();
      nameList.add("Adrian");
      nameList.add("cIprian");
      nameList.add("marcel");
      nameList.add("CaTalin");
      nameList = sortListKeySensitive(nameList);
        System.out.println(nameList);
    }

    public static List<String> sortListKeySensitive(List<String>stringList){
        return stringList.stream().sorted((s1,s2)->s2.compareToIgnoreCase(s1)).collect(Collectors.toList());



    }
}
