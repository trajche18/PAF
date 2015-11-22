package scenario1;
//verandering
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveFormat {
    private List<Format> formats;

    public SaveFormat() {
        this.formats = getAllFormats();
    }

    private List<Format> getFormats() {
        return formats;
    }

    public static List<Format> getAllFormats() {
        List<Format> allFormats = new ArrayList();
        allFormats.add(new Format("Microsoft Word '97", "doc"));
        allFormats.add(new Format("Microsoft Word XML", "docxml"));
        allFormats.add(new Format("Rich Text Format", "rtf"));
        allFormats.add(new Format("Plain Text", "txt"));
        allFormats.add(new Format("HTML Document", "html"));

        return allFormats;
    }

    public void toonFormatKeuzes() {
        int keuzeNr = 1;
        for (Format f : getFormats()) {
            System.out.println(keuzeNr++ + " " + f);
        }
    }

    private int vraagKeuzeNummer() {
        int keuzeNummer = -1;

        String input = new Scanner(System.in).nextLine();
        try {
            keuzeNummer = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("No format selected!");
        }

        if (!(keuzeNummer > 0 && keuzeNummer <= formats.size())) {
            keuzeNummer = -1;   //-1 is net als false. De uitput toont -1 als het om nummer gaat die kleiner is dan 0 of groter dan de arrayList (5)
            System.out.println("\nPlease select a valid format!");
        }
        return keuzeNummer;
    }

    public static void main(String[] args) {
        SaveFormat saveFormat = new SaveFormat();
        saveFormat.toonFormatKeuzes();
        System.out.print("\nPlease choose a format, from the formats above: ");
        int keuzeNummer = saveFormat.vraagKeuzeNummer();
        System.out.println("_____" + "\nFormatnumber chosen: " + keuzeNummer );
        System.out.println("File saved as: " + saveFormat.getFormats().get(keuzeNummer - 1));
    }

}