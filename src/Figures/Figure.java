package src.Figures;

public abstract class Figure implements IFigure {
    private String borderColor, color;
    private Rectangle rectangle;

    protected Figure(Point start, Point end){
        Rectangle rectangleContainer = new Rectangle(start, end);
        this.rectangle = rectangleContainer;
        this.borderColor = "negro";
        this.color = "blanco";
    }
    public void setBorderColor(String borderColor){
        this.borderColor = borderColor;
    }
    public String getBorderColor(){
        return this.borderColor;
    }
    public String getBgColor(){
        return this.color;
    }
    public void setBgColor(String bgColor){
        this.color = bgColor;
    }
    public Rectangle getRectangle(){
        return this.rectangle;
    }
    public void setRectangle(Point start, Point end){
        Rectangle rectangleContainer = new Rectangle(start, end);
        this.rectangle = rectangleContainer;
    } 
    public abstract void draw();

}
