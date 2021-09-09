public class PriceDisplay implements Observer{


    @Override
    public void update(StocksData stocks) {
        System.out.println("The Price of "+stocks.getStockName()+" has changed to:"+stocks.getStockPrice());
    }
}
