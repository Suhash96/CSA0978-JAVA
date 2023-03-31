import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

 class ColorChanger implements Runnable {

    private JLabel label;
    private boolean running;

    public ColorChanger(JLabel label) {
        this.label = label;
        running = true;
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            label.setForeground(randomColor());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Color randomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        JLabel label = new JLabel("Hello, world!");
        frame.add(label);
        frame.pack();
        frame.setVisible(true);

        ColorChanger colorChanger = new ColorChanger(label);
        Thread thread = new Thread(colorChanger);
        thread.start();

        // Wait for 10 seconds before stopping the thread
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        colorChanger.stop();
    }
}