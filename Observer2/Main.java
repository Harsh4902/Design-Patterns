//Observer Pattern example

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        StockAgency nse = new StockAgency();
        

        StockBrocker sb1 = new StockBrocker();
        StockBrocker sb2 = new StockBrocker();

        nse.addObserver(sb1);
        nse.addObserver(sb2);

        for(int i=0;i<5;i++){
            Stock s1 = new Stock("TCS", random.nextInt(350-300 + 1) + 300);
            nse.setStock(s1);
            System.out.println(sb1.getStock());
            System.out.println(sb2.getStock());
        }
    }
}

class StockAgency{

    private Stock stock;
    private List<StockBrocker> stockBrockers = new ArrayList<>();

    public void addObserver(StockBrocker stockbrocker){
        this.stockBrockers.add(stockbrocker);
    }

    public void removeObserver(StockBrocker stockbrocker){
        this.stockBrockers.remove(stockbrocker);
    }

    public void setStock(Stock stock){
        this.stock = stock;
        for(StockBrocker brocker : stockBrockers){
            brocker.update(stock);
        }
    }

}

class Stock{

    public String name;
    public int price;

    public Stock(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.price;
    }

}

class StockBrocker{
    private Stock stock;

    public void update(Stock stock){
        this.setStock(stock);
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Stock getStock() {
        return stock;
    }
}
