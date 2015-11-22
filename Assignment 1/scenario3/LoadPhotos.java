package scenario3;

/**
 * Created by Trajche on 21-Nov-15.
 */
import java.util.Scanner;

public class LoadPhotos {
    public static void main(String[] args) {
        Gallery gallery = new Gallery();
        System.out.print("Pictures are being loaded..\n_____");
        Photo pica1 = new Photo("IMG_2843", 960, 1280);
        gallery.addPhoto(pica1);
        Photo pica2 = new Photo("mixed-logo", 2624, 2184);
        gallery.addPhoto(pica2);
        Photo pica3 = new Photo("Starbucks_Corporation_2011", 1017, 1024);
        gallery.addPhoto(pica3);
        Photo pica4 = new Photo("makedonijaPelister", 600, 375);
        gallery.addPhoto(pica4);
        Photo testpica = new Photo(null, 0, 0);


        Scanner scannerName = new Scanner(System.in);
        System.out.print("\nPlease insert a name: ");
        String name = scannerName.nextLine();
        testpica.setName(name);

        Scanner scannerWidth = new Scanner(System.in);
        System.out.print("Please insert the width value: ");
        int width = scannerWidth.nextInt();
        testpica.setWidth(width);

        Scanner scannerHeight = new Scanner(System.in);
        System.out.print("Please insert the height value: ");
        int height = scannerHeight.nextInt();
        testpica.setHeight(height);

        gallery.searchPhoto(name, width, height);
    }
}