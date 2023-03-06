package MainCode2;
import MainCode2.ProductDescription;

public class Product {
	private String productName;
    private int quantity;
    private ProductDescription description;

    /**
     * Constructs a new Product object with the given name, quantity, and description.
     *
     * @param prodName the name of the product
     * @param quantity the quantity of the product
     * @param description the description of the product
     */
    public Product(String prodName, int quantity, ProductDescription description) {
        this.productName = prodName;
        this.quantity = quantity;
        this.description = description;
    }
    
    /**
     * Gets the name of the product.
     *
     * @return the name of the product
     */
    public String getName(){
    	return this.productName;
    }
    
    /**
     * Gets the quantity of the product.
     *
     * @return the quantity of the product
     */
    public int getQuantity() {
    	return this.quantity;
    }
    
    /**
     * Gets the description of the product.
     *
     * @return the description of the product
     */
    public ProductDescription getDescription() {
    	return this.description;
    }
    
    /**
     * Updates the name of the product.
     *
     * @param newName the new name of the product
     */
    public void updateName(String newName){
    	this.productName = newName;
    }
    
    /**
     * Updates the quantity of the product.
     *
     * @param newQuantity the new quantity of the product
     */
    public void updateQuantity(int newQuantity) {
    	this.quantity = newQuantity;
    }
    
    /**
     * Updates the description of the product.
     *
     * @param newDescription the new description of the product
     */
    public void updateDescription(ProductDescription newDescription) {
    	this.description = newDescription;
    }
    
    /**
     * Returns a string representation of the product.
     *
     * @return a string representation of the product
     */
    public String toString(){
        return "Name: "+getName()+"\n"+"Amount available: "+getQuantity()+"\n"+"Price: $"+description.getPrice()+"\n"+"Product Description: "+description.getDescription()+"\n";
    }

}
