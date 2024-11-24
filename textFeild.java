import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame extends Frame{
  Label l1,l2;
  TextField tf;
  MyFrame(){
    l1=new Label("No text is entered. TextFeild is blank");
    tf = new TextField(20);
    l2=new Label("Enter key is not yet hit");

   

    setLayout(new FlowLayout());
    add(l1);
    add(tf);
    add(l2);

  
  }

}
public class textFeild {
  public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(400, 300);
      f.setVisible(true);
  }
}
