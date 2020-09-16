package part1;
import TurtleGraphics.*;
import BreezySwing.*;

public class ObjectExample {

    
    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        
        /* multi-line comment
        Objects are created from a CLASS
        p1 is an INSTANCE (Object) of the Pen class
        Instantiating an object = making an object
        */
        p1.move(25);
        p1.move(-30,50);
        
        /*
        p1. -> brings up a list of methods (abilities) that p1 has
        Some methods are found directly in Pen
        Other are INHERITED from the "Class of all Classes" -> object
        //examples -> toString, hashCode, compareTo
        */
        
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
        /*
        Even though wp and rp are different TYPES of pens
        They respond to the same commands as p1
        Since all 3 pens have the "Pen" class are their Parent
        Pen is where most of these methods are defined and the 3
        actual pens inherit these methods
        */
    }
    
}
