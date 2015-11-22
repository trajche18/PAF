package scenario2;

/**
 * Created by Trajche on 19-Nov-15.
 */
public class RechthoekTekenaar extends VormTekenaar {

    public void tekenLinksBoven(double x, double y, double w, double h) {
        tekenLinksBoven(x, y, new Rechthoek(w, h));
    }

    public void tekenLinksOnder(double x1  , double y, double width, double height) {
        tekenLinksOnder(x1,y,new Rechthoek(width,height));
    }

    @Override
    public void tekenLinksOnder(double x, double y, Vorm vorm) {
        tekenLinksBoven(x,y-((Rechthoek)vorm).getHeight(),vorm);
    }

    public static void main(String[] args) {
        RechthoekTekenaar rechthoekTekenaar = new RechthoekTekenaar();
        rechthoekTekenaar.tekenLinksBoven(5,10,20,30);  //begint bij punt links boven
        rechthoekTekenaar.tekenLinksOnder(5,10+30,20,30);   //beging bij punt  links onder
    }
}
