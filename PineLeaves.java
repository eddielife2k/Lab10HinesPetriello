
import java.awt.*;
import java.applet.*;
import java.util.*;
public class PineLeaves
{
    private Point p1;
    private Point p2;
    public PineLeaves(int x1, int y1, int x2, int y2)
    {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }
    public void draw(Graphics g) {
        g.setColor(new Color(97, 153, 59));
        Polygon leaves = new Polygon();
        leaves.addPoint(p1.getX(), p1.getY());
        leaves.addPoint(p1.getX() + 50, p1.getY() + 50);
        leaves.addPoint(p1.getX() - 50, p1.getY() + 50);
        g.fillPolygon(leaves);
    }
}
