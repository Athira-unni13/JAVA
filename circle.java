class circles {
  public double radius;
  public void area(int radius){
    double area = (3.14*radius*radius);
    System.out.println("Area of circle is "+area);
  }
  
}
class circle{
  public static void main(String args[]){
    circles c1 = new circles();
    c1.area(5);
  }
}
