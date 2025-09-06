package com.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Integer num = 87456;
        String reversed = new StringBuilder(num.toString()).reverse().toString();
        int reversedNum = Integer.parseInt(reversed);

        System.out.println(reversedNum); // 65478

        String testPalindrome = "MADAM";

        String reversedPoly = new StringBuilder(testPalindrome).reverse().toString();
        testPalindrome.equalsIgnoreCase(reversedPoly);  // case-insensitive

        //implement logic to find the minimum and maximum occurrence of characters in a string.

        String input = "successes";  // example

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
          //  freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {

           // System.out.println(entry.getKey() + " : " + entry.getValue());
        }

       // Write a function to check if a string is a palindrome.   MADAM , LEVEL

        String testPalindrom="automation";

        Collections.reverse(Arrays.asList(testPalindrom.split("")));
        System.out.println(testPalindrom);

             //   Solve array manipulation problems, such as rotating an array

        Integer[] arr = {1, 2, 3, 4, 5};  // Wrapper type, not primitive
        List<Integer> RoLlist = Arrays.asList(arr); // works as expected

        Collections.rotate(RoLlist, 2);
       // RoLlist.forEach(System.out::println);

        //fibonacci series

       // 0,1,1,2,3,5,7,12

        int a =0;
        int  b =1;
        int range =10;


        for(int i=2 ; i<range ; i++){

           int c = a+b;
           System.out.println(c);
            a = b;
            b = c;




        }

        //no of vowels and constatns

        String testString ="automation";
        String constovlsString ="aeiou";

        int countO=0;

        int countV=0;

       char[] test = testString.toCharArray();

       for (char ch : test) {
           if(constovlsString.contains(String.valueOf(ch)))
           {
               countO++;
           }else{
               countV++;
           }

       }
        System.out.println(countO);
        System.out.println(countV);

    }
}
