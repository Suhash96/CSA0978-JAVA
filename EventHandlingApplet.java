import java.applet.*;
import java.awt.*;
import java.awt.event.*;

 class EventHandlingApplet extends  implements ActionListener {
   Button btn;
   
   public void init() {
      btn = new Button("Click me!");
      add(btn);
      btn.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e) {
      System.out.println("Button clicked!");
   }
}