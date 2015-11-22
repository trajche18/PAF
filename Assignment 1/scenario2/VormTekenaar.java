package scenario2;

/**
 * Created by Trajche on 19-Nov-15.
 */
public abstract class VormTekenaar {

    public void tekenLinksBoven(double x, double y, Vorm vorm) {
        System.out.println("Drawing an (mathematical) object, starting from the upper left corner -> x: " +x+ " and y: " +y);
        vorm.teken();
    }

   public abstract void tekenLinksOnder(double x, double y, Vorm vorm);
}
