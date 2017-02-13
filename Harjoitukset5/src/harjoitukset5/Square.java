package harjoitukset;

/**
 * Created by s698929 on 5.2.2017.
 */
public class Square extends Enclosure {
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return Math.pow(width, 2);
    }

    public double perimeter() {
        return 4 * width;
    }
}
