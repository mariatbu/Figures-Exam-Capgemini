package src.Figures;

public class FigureFactory {
    public IFigure getFigure(Figuras fig, Point start, Point end){
        if(fig == Figuras.STAR){
            return new Star(start, end);
        }
        else if(fig == Figuras.HEART){
            return new Heart(start, end);
        }
        else{
            return new Ray(start, end);
        }
    }
}
