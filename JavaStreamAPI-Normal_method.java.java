import java.util.*;
class Product{
	int id ;
	String name;
	Float price;
	public Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
		}
	}
public class JavaStreamExample{
	public static void main(String[] args){
		list<product>productList : new ArrayList<product>();
		productList.add(new product (1, "HP", 25000f));
		productList.add(new product (1,  "Dell", 20000f));
		productList.add(new product (1, "Victus", 30000f));
		productList.add(new product (1, "Lenovo", 28000f));
		productList.add(new product (1, "MACBOOK", 90000f));
		
		List<Float>productPriceList = new ArrayList<float>();
		for(Product product : product(List)){
			if(product.price<30000){
				productPriceList.add(product.price);
		}
	}
	System.out.println(productPriceList);
	}
}