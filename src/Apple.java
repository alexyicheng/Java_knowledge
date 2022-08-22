
public abstract class Apple {

	private double price;
	private String producttypString;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	public Apple(double price, String producttypString) {
		super();
		this.setPrice(price);
		this.setProducttypString(producttypString);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProducttypString() {
		return producttypString;
	}

	public void setProducttypString(String producttypString) {
		this.producttypString = producttypString;
	}
	
	
	
}
