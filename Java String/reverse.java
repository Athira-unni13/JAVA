//Write a program to reverse a given string without using built-in methods.

import java.util.*;
import java.io.*;
import java.lang.*;

public class reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word;
    System.out.print("Enter a string: ");
    word = sc.nextLine();
    char[] charArray = word.toCharArray();
    // System.out.println(charArray);
    for(int i = 0; i<charArray.length; i++){
      char first = charArray[i];
      char last = charArray[charArray.length-1-i];
      charArray[i] = last;
      charArray[charArray.length-1-i] = first;
     }
     System.out.println(charArray);
  }
}
