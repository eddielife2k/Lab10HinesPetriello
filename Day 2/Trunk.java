import java.awt.*;
import java.applet.*;
import java.util.*;
public class Trunk
{
    private Point p1;
    private Point p2;
    public Trunk(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }
    public void draw(Graphics g) {
        g.setColor(new Color(80, 42, 42));
        g.fillRect(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
