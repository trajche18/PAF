package scenario2;

/**
 * Created by Trajche on 19-Nov-15.
 */
public class CirkelTekenaar extends VormTekenaar {

   private void tekenLinksOnder(double x, double y, double straal) {
        tekenLinksOnder(x, y, new Cirkel(straal));
    }

    private void tekenLinksBoven(double x, double y, double straal) {
        tekenLinksBoven(x, y, new Cirkel(straal));
    }

    @Override
    public void tekenLinksOnder(double x, double y, Vorm vorm) {
        tekenLinksBoven(x, y - ((Cirkel) vorm).getStraal() * 2, vorm);
    }

    public static void main(String[] args) {
        CirkelTekenaar CirkelTekenaar = new CirkelTekenaar();
        CirkelTekenaar.tekenLinksBoven(5, 10, 20);  //begint bij punt links boven
        CirkelTekenaar.tekenLinksOnder(5, 10 + 40, 20); //beging bij punt  links onder
    }

}
