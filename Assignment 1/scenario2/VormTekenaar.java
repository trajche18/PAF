package scenario2;

/**
 * Created by Trajche on 19-Nov-15.
 */
public abstract class VormTekenaar {

    public void tekenLinksBoven(double x, double y, Vorm vorm) {
        System.out.println("Tekent rechthoek op (linksboven) x:" + x + ", y:" + y);
        vorm.teken();
    }

    public abstract void tekenLinksOnder(double x, double y, Vorm vorm);
}
