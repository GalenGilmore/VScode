package chapter9;

public class BandBoosterTester{

    public static void main(String[] args) {
        BandBooster booster = new BandBooster("Galen");
        booster.updateSales(10);
        booster.updateSales(20);
        System.out.println(booster);
        booster.updateSales(40);
        System.out.println(booster);
    }
    
}