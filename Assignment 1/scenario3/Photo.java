package scenario3;

/**
 * Created by Trajche on 21-Nov-15.
 */
public class Photo {
    private String name;
    private int width;
    private int height;


    public Photo(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String displayImage(){
        return "Photo selecterd: \nName: "+name+"\nWidth :"+width+"\nHeight :"+height;
    }
}