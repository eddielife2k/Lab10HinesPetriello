import java.awt.*;
import java.applet.*;
import java.util.*;
public class Leaves
{
   private Point p1;
   private Point p2;
   public Leaves(int x1, int y1, int x2, int y2) {
       p1 = new Point(x1, y1);
       p2 = new Point(x2, y2);
    }
   public void draw(Graphics g) {
       g.setColor(Color.green);
       g.fillOval(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
