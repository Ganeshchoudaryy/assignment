public class Main {

    public static void main(String[] args) {
        //Create stocks
        Amzn amzn = new Amzn();
        Russels crudeOil = new Russels();
        DawnIndustries dawnIndustries = new DawnIndustries();


        //Create Observers
        PriceDisplay price = new PriceDisplay();

        //Register Observers for stocks
        amzn.registerObserver(price);
        crudeOil.registerObserver(price);

       // dawnIndustries.removeObserver(price);



        //Set some random stock prices
        for(int i =0; i<10; i++){
            amzn.updateStockPrice((int)(Math.random()*101)+1);
            crudeOil.updateStockPrice((int)(Math.random()*101)+1);

        }

    }
}
