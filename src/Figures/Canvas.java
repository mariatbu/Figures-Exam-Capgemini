package src.Figures;
import java.util.*;

public class Canvas {
    private final List<IFigure> figures;

    public Canvas(){
        this.figures = new ArrayList<IFigure>();
    }
    public List<IFigure> getFigures(){
        return this.figures;
    }
    public void addFigure(IFigure figure){
        this.figures.add(figure);
        figure.draw();
        //TODO: establecer figure como seleccionada
        Point p = new Point(figure.getRectangle().left, figure.getRectangle().top);
        this.getSelected(p);
    }

    public IFigure getSelected(Point pointer){
        for (IFigure figure: this.getFigures()){
            Rectangle rec = figure.getRectangle();
            if (pointer.x >= rec.left && pointer.x <= rec.right && pointer.y >= rec.top && pointer.y <= rec.bottom){
                return figure;
            } 
        }
        return null;
    }
}
