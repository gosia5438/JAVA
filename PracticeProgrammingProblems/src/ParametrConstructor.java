public class ParametrConstructor {
    private String dogName;
    private int dogAge;
    private float dogWeight;
    private float dogSize;
    public ParametrConstructor(String dogName, int dogAge, float dogWeight, float dogSize)
    {
       this.dogName = dogName;
       this.dogAge = dogAge;
       this.dogWeight = dogWeight;
       this.dogSize = dogSize;

        System.out.println("Moj pies ma na imie " + dogName + " ma lat " + dogAge + " jego rozmiar to " + dogSize + " , a waga " + dogWeight);
    }
}
