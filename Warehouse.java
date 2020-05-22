import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productList;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productList = new HashMap<>();
        this.productStock = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {
        this.productList.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        if (this.productList.containsKey(product)) {
            return this.productList.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productStock.containsKey(product)) {
            return this.productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.productStock.containsKey(product)) {
            if (this.productStock.get(product) > 0) {
                int stock = this.productStock.get(product) - 1;
                this.productStock.put(product, stock);
                return true;
            }
        }
        return false;

    }
    public Set<String> products(){
        return this.productList.keySet();
    } 

}
