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
        g.drawRect(p1.getX(), p1.getY(), p2.getX(), p2.getX());
        g.drawRect(p1.getX()+50,p1.getY()+50,p2.getX(),p2.getX());
        g.drawLine(p1.getX(), p1.getY(),p1.getX()+50,p1.getY()+50);
        g.drawLine(p1.getX(), p1.getY()+p2.getX(), p1.getX()+50,p1.getY()+50+p2.getX());
        g.drawLine(p1.getX()+p2.getX(),p1.getY(), p1.getX()+50+ p2.getX(),p1.getY()+50);
        g.drawLine(p1.getX()+p2.getX(),p1.getY()+p2.getX(),
        p1.getX()+ 50 + p2.getX(), p1.getY() + 50 + p2.getX());
      
    }
}
