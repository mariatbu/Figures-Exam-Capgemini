package src.Figures;

public class Ray extends Figure {

    public Ray(Point start, Point end){
        super(start, end);
    }

    public void draw(){
        System.out.println("Rayo con el borde de color "+ this.getBorderColor()+ " y relleno de color "+ this.getBgColor()+".");
    }
}
