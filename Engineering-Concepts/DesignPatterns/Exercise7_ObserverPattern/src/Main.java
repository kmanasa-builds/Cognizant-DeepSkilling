public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();

        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);

        stockMarket.registerObserver(web);

        stockMarket.setStockPrice("TCS", 3500);

        System.out.println();

        stockMarket.setStockPrice("Infosys", 1600);

    }

}