package MainCode2;
import java.util.ArrayList;
import MainCode2.Product;

public class Inventory {
	private ArrayList<Product> products;
	private int totalProducts;

	//Constructs a new Inventory object with an empty list of products and zero total products.
    public Inventory() {
        this.products = new ArrayList<Product>();
        this.totalProducts = 0;
    }

    /**
     * Adds a new product to the inventory.
     *
     * @param product the new product to add
     */
    public void addNewProduct(Product product) {
        this.products.add(product);
    }
    
    /**
     * Gets the list of products in the inventory.
     *
     * @return the list of products in the inventory
     */
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    
    /**
     * Displays all the products in the inventory.
     */
    public void displayProducts() {
        
        for(Product prod: products)
            System.out.println(prod.toString());
    }

    /**
     * Finds a product in the inventory by name.
     *
     * @param name the name of the product to find
     * @return the product with the given name, or null if no such product exists
     */
    public Product findProduct(String name){
        
        for(Product prod: products){
            if (prod.getName().equals(name))
                return prod;
        }
        return null;
    }

}
