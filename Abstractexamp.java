abstract class shape{
  abstract void area();
  abstract void perimeter();
}
class circle extends shape{
  double radius;
  @Override
  void area(){
    System.out.println("Area of circle is "+ (3.14 * radius*radius));
  }
  void perimeter(){
    System.out.println("Perimeter of circle is "+(3.14*2*radius));
  }
}
class rectangle extends shape{
  double length;
  double breadth;
  @Override
  void area(){
    System.out.println("Area of rectangle "+(length*breadth));
  }
  void perimeter(){
    System.out.println("perimeter of rectangle "+(2*(length+breadth)));
  }
}
public class Abstractexamp {
  public static void main(String[] args) {
      circle c = new circle();
      rectangle r = new rectangle();
      shape rs = r;
      shape s =c; 
      c.radius=2.5;
      s.area();
      s.perimeter();
      r.length =10;
      r.breadth=20;
      rs.area();
      rs.perimeter();

  }
  
}
