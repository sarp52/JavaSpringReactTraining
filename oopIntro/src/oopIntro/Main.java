package oopIntro;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",150,"16 GB Ram");
        
        //Bu iki metod aynı sonucu verir.
        
        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Toshiba";
        product2.unitPrice = 600;
        product2.detail = "16 GB Ram";
        
        
        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Adidas";
        product3.unitPrice = 230;
        product3.detail = "46 GB Ram";
        
        System.out.println("---------------------------------");
        Product[] products = { product1, product2, product3};
        System.out.println("Toplam ürün sayısı: " + products.length);
        
        for (Product product : products) {
        	System.out.print(product.id + " nolu ürünün adı : "  +product.name + ", fiyatı : "  +product.unitPrice + ", detayı: "  +product.detail + "\n");
		}
        
        System.out.println("---------------------------------");

        Category category1 = new Category();
        category1.id=1;
        category1.name= "Bilgisayar";
    	
        Category category2 = new Category();
        category2.id=2;
        category2.name= "Ev/Bahçe";
     
        Category[] categories = { category1, category2};

        System.out.println("Toplam ürün sayısı: " + categories.length);
        for (Category categorie : categories) {
        	System.out.print(categorie.id + " nolu kategorinin adı : "  +categorie.name+ "\n");
		}
        System.out.println("---------------------------------");

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
       
        System.out.println("---------------------------------");


    }
}
