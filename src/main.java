package src;
import src.Figures.*;
import java.util.*;

public class main {

    public static void main (String [] args){

        FigureFactory factory = new FigureFactory();
        Canvas lienzo = new Canvas();

        //TEST 1
        Point start = new Point(0, 0);
        Point end = new Point(1, 1);
        IFigure heart = factory.getFigure(Figuras.HEART, start, end);
        lienzo.addFigure(heart);

        Point start2 = new Point(3, 5);
        Point end2 = new Point(7, 10);
        IFigure star = factory.getFigure(Figuras.STAR, start2, end2);
        star.setBgColor("azul");
        star.setBorderColor("verde");
        lienzo.addFigure(star);

        Point start3 = new Point(20, 5);
        Point end3 = new Point(24, 9);
        IFigure ray = factory.getFigure(Figuras.RAY, start3, end3);
        ray.setBgColor("negro");
        ray.setBgColor("amarillo");
        lienzo.addFigure(ray);

        //TEST 2
        Point cursor = new Point(5, 7);
        IFigure selected = lienzo.getSelected(cursor);
        selected.setRectangle(new Point(8, 4), new Point(3, 0));
        Rectangle resultRec = selected.getRectangle();
        int left = resultRec.left;
        int right = resultRec.right;
        int top = resultRec.top;
        int bottom = resultRec.bottom;
        //Comprobación de que puedo pintar figuras en cualquier dirección y sentido
        System.out.println("Right: "+ right + ", left: "+left+ ", top: "+ top + ", bottom: "+bottom);
        selected.setBorderColor("rojo");
        selected.setBgColor("rojo");
        selected.draw();
    }
}
