import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyButtonFrame extends JFrame implements ActionListener {
    private JButton myButton;
    private JLabel clickCountLabel;
    private int clickCount = 0;

    public MyButtonFrame() {
        // Set up the window
        super("My Button App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create a button and add an action listener to it
        myButton = new JButton("Click me!");
        myButton.addActionListener(this);

        // Create a label to display the click count
        clickCountLabel = new JLabel("Button has been clicked 0 times.");

        // Add the button and label to the window
        add(myButton);
        add(clickCountLabel, "South");
    }

    public void actionPerformed(ActionEvent event) {
        // Update the click count and label text when the button is clicked
        clickCount++;
        clickCountLabel.setText("Button has been clicked " + clickCount + " times.");
    }

    public static void main(String[] args) {
        // Create and show the window
        MyButtonFrame frame = new MyButtonFrame();
        frame.setVisible(true);
    }
}