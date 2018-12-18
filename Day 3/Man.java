import java.awt.*;
import java.applet.*;
import java.util.*;
public class Man
{
    Point p1;
    Point p2;
    public Man(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        g.drawLine(p1.getX() + p2.getX() / 2, p1.getY(),
                   p1.getX() + p2.getX() / 2, p1.getY() + 100);
        g.drawLine(p1.getX() + p2.getX() / 2, p1.getY() + 100,
                   p1.getX(), p1.getY() + 2 * p2.getY() );
        g.drawLine(p1.getX() + p2.getX() / 2, p1.getY() + 100,
                   p1.getX() + p2.getX(), p1.getY() + 2 * p2.getY());
    }    
}
