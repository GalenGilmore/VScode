public class BandBooster{

    private String name;
    private int boxesSold;

    public BandBooster(String name){
        boxesSold = 0;
        this.name = name;
    }

    public void updateSales(int amount){
        boxesSold += amount;
    }

    public String getName(){
        return name;
    }

    public int getNumBoxes(){
        return boxesSold;
    }

    public String toString(){
        return name + ": " + boxesSold;
    }

}