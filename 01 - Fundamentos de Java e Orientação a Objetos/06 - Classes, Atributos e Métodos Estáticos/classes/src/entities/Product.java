package entities;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void addProduct(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(Integer quantity) {
		if(this.quantity - quantity >= 0) {
			this.quantity -= quantity;
		}else {
			System.out.println("Quantidade a ser removida é superior ao saldo de estoque. "
					+ "Verifique a quantidade a ser removida e tente novamente.");
		}
	}
	
	public Double totalValueInStock() {
		return this.quantity * this.price;
	}
	
	@Override
	public String toString() {
		return "Product {name: " + name 
				+ ", price: " + String.format("%.2f", price) 
				+ ", quantity: " + quantity 
				+ ", Total: R$ " + String.format("%.2f", totalValueInStock()) + "}";
	}
}
