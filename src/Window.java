import java.awt.GraphicsDevice; // To get screen size
import java.awt.GraphicsEnvironment;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window {
    private Window(String title, int width, int height, Window parent) {
        JFrame frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        // frame.setUndecorated(true); // remove window decorations
        frame.setResizable(false); // disable window resizing

        frame.setVisible(true);
    }

    public static Window createMainWindow() {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
        Dimension screenSize = device.getDefaultConfiguration().getBounds().getSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        Window mainWindow = new Window("Main Window", screenWidth, screenHeight, null);
        return mainWindow;
    }

    public void createSubWindow() {
        Window subWindow = new Window("Sub Window", 400, 300, this);
    }

}
