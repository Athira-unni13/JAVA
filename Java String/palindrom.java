import java.util.*;

public class palindrom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String word = sc.nextLine();
    char[] charArray = word.toCharArray();
    // System.out.println(charArray);
    for(int i = 0; i<charArray.length/2; i++){
      char temp = charArray[i];
      charArray[i] = charArray[charArray.length - 1 - i];
      charArray[charArray.length - 1 - i] = temp;
     }
     String reversed = new String(charArray);
     if (reversed.equals(word)) 
     {
      System.out.println("The string is a palindrom"); 
     }
     else{
      System.out.println("The string is not a palindrom");
     }

  }
}