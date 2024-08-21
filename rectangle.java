class superclass{
  public void display(){
    System.out.println("This is superclass");
  }
}
class subclass extends superclass{
  
  public void display(){
    System.out.println("This is subclass");
  }
}
/**
 * rectangle
 */
public class rectangle {

  public static void main(String[] args) {
    subclass s = new subclass();
    s.display();
  }
}