
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends Frame implements ActionListener{

    int count =0;
    Label l;
    Button b1,b2 ;
    myFrame(){
        super("My Frame");
        l = new Label("   "+ count);
        b1 = new Button("Click");
        b2 = new Button("Reset");
        b2.addActionListener(this);
        b1.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b1);
        add(b2);

    }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            count++;
            l.setText("   "+ count);
        }
        else if(e.getSource() == b2){
            count = 0 ;
            l.setText("   "+ count);
        }
       
    }
    

}

public class Solution{
    public static void main(String[] args) {
        myFrame f = new myFrame();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}