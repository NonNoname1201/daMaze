import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Full Screen Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true); // remove window decorations
        frame.setResizable(false); // disable window resizing

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
        device.setFullScreenWindow(frame); // set window to fullscreen mode

        frame.setVisible(true);
    }


}
