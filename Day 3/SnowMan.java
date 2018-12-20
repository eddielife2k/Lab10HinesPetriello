import java.awt.*;
import java.applet.*;
import java.util.*;
public class SnowMan extends Man
{
    public SnowMan(int x1, int y1, int x2, int y2) {
        super( x1 , y1 , x2 , y2 );
    }
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        
        g.fillOval(p1.getX() - p2.getY() / 2, p1.getY() + p2.getY() , p2.getX() * 2, p2.getY() * 2);
        g.fillOval(p1.getX() - p2.getY(), p1.getY() + p2.getY() * 3 , p2.getX() * 3, p2.getY() * 3);
        Polygon topHat = new Polygon();
        topHat.addPoint(p1.getX(), p1.getY());
        topHat.addPoint(p1.getX(), p1.getY() - p2.getY() / 16);
        topHat.addPoint(p1.getX() + p2.getX() / 8, p1.getY() - p2.getY() / 16);
        topHat.addPoint(p1.getX() + p2.getX() / 8, p1.getY() - p2.getY() / 4 );
        topHat.addPoint(p1.getX() + p2.getX() - p2.getX() / 8, p1.getY() - p2.getY() / 4 );
        topHat.addPoint(p1.getX() + p2.getX() - p2.getX() / 8, p1.getY() - p2.getY() / 16);
        topHat.addPoint(p1.getX() + p2.getX(), p1.getY() - p2.getY() / 16);
        topHat.addPoint(p1.getX() + p2.getX(), p1.getY());
        g.drawPolygon(topHat);
    }
}   
