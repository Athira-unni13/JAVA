class superc{
  public void meth1(){
    System.out.println("Super class method1");
  }
  public void meth2(){
    System.out.println("Super class method2");
  }
}
class sub extends superc{
  public void meth2(){
    System.out.println("sub class meth1");
  }
  public void meth3(){
    System.out.println("sub class method3");
  }
}
class dynamic{
  public static void main(String[] args) {
    sub s = new sub();
    s.meth2();
    s.meth1();
    s.meth3();
  }
}