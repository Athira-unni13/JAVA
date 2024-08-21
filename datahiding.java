import java.util.*;
import java.lang.*;

class Rectangle{
  private double length;
  private double breadth;
  double area(){
    return length * breadth;
  }
  double perimeter(){
    return 2*(length+breadth);
  }
  double getlength(){
    return length;
  }
  void setlength(double l){
    length = l ;
    
  }
  double getbreadth(){
    return breadth;
  }
  void setbreadth(double b){
    breadth = b ;
  
  }
}
class datahiding{
  public static void main(String[] args) {
    Rectangle r=new Rectangle();
    r.setlength(10);
    r.setbreadth(10.9);
    System.out.println(r.area());
    System.out.println(r.perimeter());
  }
}