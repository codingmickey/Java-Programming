import java.util.*;

public class VectorsP {

    public static void main(String[] args) {

        Vector v = new Vector(4);
        System.out.println(v.size());
        System.out.println(v.capacity());

        v.addElement(new Integer(5));
        v.addElement(new Integer(10));
        v.addElement(new Integer(8));
        v.addElement(new Integer(5));
        v.addElement(new Integer(7));
        v.addElement(new Integer(5));
        v.addElement(new Integer(10));
        v.addElement(new Integer(8));
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement(new Integer(5));
        v.addElement(new Integer(7));
        v.addElement(new Integer(5));
        System.out.println(v.size());
        System.out.println("THIS " + v.capacity());
        v.addElement(new Integer(10));
        v.addElement(new Integer(8));
        v.addElement(new Integer(5));
        v.addElement(new Integer(7));

        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v);

    }

}
