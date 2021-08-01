package src.Figures;

public class Star extends Figure {

    public Star(Point start, Point end){
        super(start, end);
    }

    public void draw(){
        System.out.println("Estrella con el borde de color "+ this.getBorderColor()+ " y relleno de color "+ this.getBgColor()+".");
    }
}
