package MainCode2;

public class ProductDescription {
    private String productID;
    private String description;
    private double price;

    /**
     * Constructs a new ProductDescription object.
     * @param productID the ID of the product
     * @param description the description of the product
     * @param price the price of the product
     */
    public ProductDescription(String productID, String description, double price) {
        this.productID = productID;
        this.description = description;
        this.price = price;
    }

    /**
     * Gets the product ID.
     * @return the product ID
     */
    public String getProductID() {
    	return this.productID;
    }

    /**
     * Gets the product description.
     * @return the product description
     */
    public String getDescription() {
    	return this.description;
    }

    /**
     * Gets the price of the product.
     * @return the price of the product
     */
    public double getPrice() {
    	return this.price;
    }

    /**
     * Updates the description of the product.
     * @param description the new description of the product
     */
    public void updateDescription(String description) {
    	this.description = description;
    }

    /**
     * Updates the price of the product.
     * @param price the new price of the product
     */
    public void updatePrice(double price) {
    	this.price = price;
    }
}
