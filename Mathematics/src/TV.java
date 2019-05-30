public class TV {


   private int size;
   private String name;
   private boolean onOff;

//   public TV(){ // słowo public -> nazwa klasy -> nawiasy
//   }

   public TV(int aSize, String name){

       size = aSize;
       this.name = name;
          }

    public int getSize() {
        return size;
    }
    public String getName(){
       return name;
    }
    public void setOnOff(boolean a){
       onOff = a;
    }
    public  void getOnOff(){
       if(onOff){ // je\sli on off jest prawdziwe to wydrukuj nam ze tv jest wlaczony
           System.out.println("TV is on");
       }
       else {
           System.out.println("TV is off");
       }
    }
}
