import java.awt.*;
import java.applet.*;
import java.util.*;
public class Box
{
    private Point p1;
    private Point p2;
    public Box(int x, int y, int x2, int y2){
        p1 = new Point(x, y);
        p2 = new Point(x2, y2);
    }
    public void draw(Graphics g) {
        g.setColor(new Color(80, 42, 42));
        g.fillRect(p1.getX(), p1.getY(), p2.getX(), p2.getX());
        g.fillRect(p1.getX()+50,p1.getY()+50,p2.getX(),p2.getX());
        
        Polygon boxSide = new Polygon();
        boxSide.addPoint( p1.getX(), p1.getY());
        boxSide.addPoint( p1.getX(), p1.getY() + 50 );
        boxSide.addPoint( p1.getX() + 50, p1.getY() + 100 );
        boxSide.addPoint( p1.getX() + 50, p1.getY() + 50  );
        g.fillPolygon(boxSide);
        
        Polygon boxIn  = new Polygon();
        boxIn.addPoint( p1.getX() + 50, p1.getY() );
        boxIn.addPoint( p1.getX() + 50, p1.getY() + 50);
        boxIn.addPoint( p1.getX() + 100, p1.getY() + 50);
        g.setColor(new Color(40, 24, 24));
        g.fillPolygon(boxIn);
        
        Polygon boxB   = new Polygon();
        boxB.addPoint( p1.getX(), p1.getY() );
        boxB.addPoint( p1.getX() + 50, p1.getY() );
        boxB.addPoint( p1.getX() + 50, p1.getY() + 50);
        g.fillPolygon(boxB); 
      
    }
}
