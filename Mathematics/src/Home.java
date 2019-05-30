public class Home {
    public static void main(String[] args) {
        TV nosy = new TV(45, "nosy111"); // tworzymy konkretna instancje klasy nosy
        TV sama = new TV(32, "sama2345");

        System.out.println(sama.getName() + " " + sama.getSize());
        System.out.println(nosy.getName() + " " + nosy.getSize());

        sama.getOnOff();
        sama.setOnOff(true);
        sama.getOnOff();

        Pies rex = new Pies();
        rex.speak();
        rex.setSize(15);
        System.out.println(rex.getSize());


    }
}
