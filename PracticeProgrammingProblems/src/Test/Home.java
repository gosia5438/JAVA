package Test;

public class Home implements ChangeChanel {
    public static void main(String[] args) {
       TV sony = new TV();
       TV sams = new TV(32, "sams12");

        System.out.println(sams.getName() + " " + sams.getSize());
        System.out.println(sony.getName() + " " + sony.getSize());


    }

    @Override
    public void changeChannel() {

    }
}
