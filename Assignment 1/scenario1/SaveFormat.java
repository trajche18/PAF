package scenario1;

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
        allFormats.add(new Format("Plain text", "txt"));
        allFormats.add(new Format("Rich Text Format", "rtf"));

        //toevoegen
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
            System.out.println("Geen nummer opgegeven!");
        }

        if (!(keuzeNummer > 0 && keuzeNummer <= formats.size())) {
            keuzeNummer = -1;
        }
        return keuzeNummer;
    }

    public static void main(String[] args) {
        SaveFormat saveFormat = new SaveFormat();
        saveFormat.toonFormatKeuzes();
        System.out.print("Geef je keuzenummer in: ");
        int keuzeNummer = saveFormat.vraagKeuzeNummer();
        System.out.println("keuzenummer: " + keuzeNummer);
        System.out.println(saveFormat.getFormats().get(keuzeNummer - 1));
    }

}