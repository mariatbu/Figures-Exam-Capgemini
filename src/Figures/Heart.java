package src.Figures;

public class Heart extends Figure {
    
    public Heart(Point start, Point end){
        super(start, end);
    }

    public void draw(){
        System.out.println("Corazón con el borde de color "+ this.getBorderColor()+ " y relleno de color "+ this.getBgColor()+".");
    }

}
