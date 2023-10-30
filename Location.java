import java.awt.*;
import java.awt.image.BufferedImage;

public class Location {
    private int x;
    private int y;
    public Location() {
        findLoc();

    }
    private void findLoc() {
        BufferedImage img = main.b.createScreenCapture(new Rectangle(65,205,750,700));
        for(int i=0;i<685;i++) {
            for(int j=0;j<495;j++) {
                if(img.getRGB(i,j)==-131587) {
                    x=i;
                    y=j;
                    return;
                }
            }
        }
    }
}
