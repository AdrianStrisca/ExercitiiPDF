package com.company.Ex1;


/*Create a method that takes a string list as a parameter , then returns the list sorted alphabetically from Z to
        A.
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Ana","Ioana","Maria","Daria");
        stringList = sortAlphabeticallyZtoA(stringList);
        System.out.println(stringList);


    }
    public static List<String> sortAlphabeticallyZtoA (List<String> stringList){
       return stringList.stream().sorted((String s1,String s2) -> s2.compareTo(s1)).collect(Collectors.toList());






    }


}
