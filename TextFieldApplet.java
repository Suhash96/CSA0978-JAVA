import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldApplet extends Applet implements ActionListener {
    TextField textField;
    Button button;

    public void init() {
        textField = new TextField(20);
        add(textField);

        button = new Button("Display");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        System.out.println(text);
    }
}