package oopIntro;

public class ProductManager {
	public void addToCart(Product product) {
		System.out.println(product.unitPrice + " fiyatlı " + product.name + " ürünü sepete eklendi." );
	}

}
