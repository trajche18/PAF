package scenario3;

/**
 * Created by Trajche on 21-Nov-15.
 */
import java.util.ArrayList;

public class Gallery {
    private ArrayList<Photo> photos;

    public Gallery(){
        photos = new ArrayList<Photo>();
    }

    public boolean searchPhoto(String name,int width, int length){
        for(Photo p : photos ){
            if(p.getName().equals(name) && p.getWidth() == (width) && p.getHeight() == (length)){
                System.out.print("This photo already exists. Please fill the attributes with other values!");
                return true;
            }
        }
        System.out.print("Photo loaded succesfully.");
        return false;
    }

    public void addPhoto(Photo newPhoto){
        photos.add(newPhoto);
    }
}