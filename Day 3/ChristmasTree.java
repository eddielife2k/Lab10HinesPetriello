import java.awt.*;
import java.applet.*;
import java.util.*;
public class ChristmasTree extends PineTree
{
    private PineLeaves upperLeaves;
    private PineLeaves lowerLeaves;
    private Trunk trunk;
    private Polygon star;
    private int x1, y1; 
    public ChristmasTree(int x1, int y1, int x2, int y2 ) {
       super(x1, y1);
       this.x1 = x1;
       this.y1 = y1;
       upperLeaves = new PineLeaves(x1, y1, 100, 100);
       lowerLeaves = new PineLeaves(x2, y2, 100, 100);
       trunk = new Trunk(x2 - 13, y2 + 50, 25, 25);
       star = new Polygon();
       star.addPoint(x1, y1 - 68);
       star.addPoint(x1 - 5, y1 - 62);
       star.addPoint(x1 - 10, y1 - 62);
       star.addPoint(x1 - 5, y1 - 56);
       star.addPoint(x1 - 10, y1 - 50);
       star.addPoint(x1, y1 - 56);
       star.addPoint(x1 + 10, y1 - 50);
       star.addPoint(x1 + 5, y1 - 56);
       star.addPoint(x1 + 10, y1 - 62);
       star.addPoint(x1 + 5, y1 - 62);
    }
    public void draw(Graphics g) {
        trunk.draw(g);
        upperLeaves.draw(g);
        lowerLeaves.draw(g);
        g.setColor(new Color(255, 255, 0));
        g.fillPolygon(star);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(x1 + 10, y1 - 30, 20, 20);
        g.setColor(new Color(0, 255, 0));
        g.fillOval(x1 - 25, y1 - 20, 20, 20);
        g.setColor(new Color(0, 255, 255));
        g.fillOval(x1 - 10, y1 + 20, 20, 20);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(x1 - 35, y1 + 40, 20, 20);
        g.setColor(new Color(0, 255, 0));
        g.fillOval(x1 - 5, y1 + 50, 20, 20);
        g.setColor(new Color(0, 0, 255));
        g.fillOval(x1 - 40, y1 + 80, 20, 20);
        g.setColor(new Color(255, 255, 0));
        g.fillOval(x1 + 20, y1 + 76, 20, 20);
    }
}
