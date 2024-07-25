// Find area of triangle
import java.lang.*;
import java.util.*;

class area{

  public static void main( String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the height of triangle");
    int height = sc.nextInt();
    System.out.println("Enter the base of triangle");
    int base = sc.nextInt();
    float area = (float)(height*base)/2;
    System.out.println("Area of triangle is "+area);

  }
}