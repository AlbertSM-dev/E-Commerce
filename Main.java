import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

public class Main {
	public static void main(String[] args) {
    Customer customer = new Customer(1, "Guest");
    Product phone1 = new Product(1, "Iphone", 1000);
    Product phone2 = new Product(2, "Android", 200);
    Product phone3 = new Product(3, "Windows Phone", 500);      
    
    
    System.out.println("------------------"); 
    System.out.println("Welcome " + customer.getName());
    System.out.println("------------------");
    System.out.println("Products Available:");
    System.out.println("-" + phone1.getName() + ": " + phone1.getPrice() + " €");
    System.out.println("-" + phone2.getName() + ": " + phone2.getPrice() + " €");
    System.out.println("-" + phone3.getName() + ": " + phone3.getPrice() + " €");
    System.out.println("------------------");    
    
    System.out.println("Shopping Cart:");
    customer.addProductToCart(phone1);
    customer.addProductToCart(phone2);
    customer.addProductToCart(phone3);
    customer.removeProductFromCart(phone1);
    customer.getShoppingCart().forEach(p -> System.out.println("-" + p.getName()));
    System.out.println("------------------");  
    System.out.println("Shopping Cart Total:");       
    System.out.println("-" + customer.calculateTotal() + " €");       
    System.out.println("------------------");  
    
    System.out.println("Order:");
    Order order = customer.placeOrder(1);
    System.out.println(order.getOrderID()); 
    order.getProducts().forEach(p -> System.out.println(p.getName()));
    System.out.println(order.getOrderTotal() + " €");
    System.out.println("------------------"); 
	}
}
