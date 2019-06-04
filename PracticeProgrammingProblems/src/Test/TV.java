package Test;

public class TV {
    private int size;
    private String name;

    public TV() {


    }

    public TV(int aSize, String name) {
        size = aSize;
        this.name = name;
    }
    public int getSize(){
        return size;
    }

    public String getName(){
        return name;
    }
}
