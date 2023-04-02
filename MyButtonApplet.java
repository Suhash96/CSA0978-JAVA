import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("deprecation")
public class MyButtonApplet extends Applet implements ActionListener {
    private Button myButton;
    private int clickCount = 0;

    public void init() {
        // Creating a button and adding an action listener to it
        myButton = new Button("Click me!");
        myButton.addActionListener(this);

        // Adding the button to the applet window
        add(myButton);
    }

    public void actionPerformed(ActionEvent event) {
        // Updating the text on the button when it is clicked
        clickCount++;
        myButton.setLabel("Clicked " + clickCount + " times!");
    }
}