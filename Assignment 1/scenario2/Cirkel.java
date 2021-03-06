package scenario2;

/**
 * Created by Trajche on 19-Nov-15.
 */
public class Cirkel extends Vorm {

    private double straal;

    public Cirkel(double straal) {
        this.straal =straal;
    }

    @Override
    public void teken() {
        System.out.println(String.format("Circle with a radius of %.2f\n", getStraal()));
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }
}
