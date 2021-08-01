package src.Figures;

public class Rectangle {
    public int left, right, bottom, top, height, width;

    public Rectangle(Point start, Point end){
        this.left = (start.x < end.x) ? start.x: end.x;
        this.right = (start.x < end.x) ? end.x: start.x;
        this.top = (start.y < end.y) ? start.y: end.y;
        this.bottom = (start.y < end.y) ? end.y: start.y;
        this.width = (this.right - this.left);
        this.height = (this.bottom - this.top);
    }
}
