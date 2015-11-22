package scenario2;

/**
 * Created by Trajche on 19-Nov-15.
 */
public class Rechthoek extends Vorm {

    private double height;
    private double width;

    public Rechthoek(double w, double h) {
        height = h;
        width = w;
    }

    @Override
    public void teken() {
        System.out.println(String.format("Rectangle with a width of %.2f and a height of %.2f\n", getWidth(), getHeight()));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
