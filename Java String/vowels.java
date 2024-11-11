import java.util.*;

public class vowels {
  public static void main(String[] args) {
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    str = sc.nextLine();
    int count = 0;
    int countC = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
      || str.charAt(i) == 'i' || str.charAt(i) == 'o'
      || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E'
      || str.charAt(i) == 'I' || str.charAt(i) == 'O'
      || str.charAt(i) == 'U') {
        count++;
        }
        else if(str.charAt(i) == ' ' || str.charAt(i) == '.' ){
          continue;
        }
        else{
          countC++;
        }
    }
    System.out.println("Number of vowels: " + count);
    System.out.println("Number of Consonant: " + countC);

  }
}
