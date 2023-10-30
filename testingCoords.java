import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
/*
 white color: -131587

 */
public class testingCoords extends JFrame {
    public static void main(String[] args) throws AWTException {
        Robot b = new Robot();
        b.delay(2000);
        BufferedImage img = b.createScreenCapture(new Rectangle(65,205,750,700));

        PointerInfo pi = MouseInfo.getPointerInfo();

        Point mouse = pi.getLocation();
        System.out.println(mouse.getX()+" "+mouse.getY());
        System.out.println(img.getRGB((int) (mouse.getX()-65), (int) (mouse.getY()-205)));

        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        frame.pack();
        frame.setVisible(true);

    }
}
