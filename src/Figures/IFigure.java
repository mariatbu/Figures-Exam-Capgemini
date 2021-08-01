package src.Figures;

public interface IFigure {
    public String getBorderColor();
    public void setBorderColor(String borderColor);
    public String getBgColor();
    public void setBgColor(String bgColor);
    public Rectangle  getRectangle();
    public void setRectangle(Point start, Point end);
    public void draw();
}
