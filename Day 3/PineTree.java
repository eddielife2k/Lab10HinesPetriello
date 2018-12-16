import java.awt.*;
import java.applet.*;
import java.util.*;
public class PineTree extends Tree
{
   protected Point p1;
   protected Point p2;
    public PineTree(int x1, int y1) {
       super(x1, y1);
       Point p1 = new Point(x1, y1);
       Point p2 = new Point(x1, y1);
   }
   public void draw(Graphics g) {
        drawLeaves(g);
        trunk.draw(g);
   }
   public void drawLeaves(Graphics g) {
        g.setColor(new Color(97, 153, 59));
        Polygon leaves = new Polygon();
        leaves.addPoint(p1.getX() + 50, p1.getY());
        leaves.addPoint(p1.getX(), p1.getY() + 50);
        leaves.addPoint(p2.getX(), p2.getY() + 50);
        g.fillPolygon(leaves);
    }
}
