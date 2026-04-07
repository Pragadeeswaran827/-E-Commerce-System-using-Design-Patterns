import java.util.*;

public class main {
    public static void main(String[] args) {

        Cart cart = Cart.getInstance();

        Product p1 = ProductFactory.getProduct("laptop");
        Product p2 = ProductFactory.getProduct("phone");

        cart.addProduct(p1);
        cart.addProduct(p2);

        System.out.println("Cart Items:");
        cart.showCart();

        int total = cart.getTotal();
        System.out.println("Total: " + total);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Payment: 1.UPI 2.Card");
        int choice = sc.nextInt();

        PaymentStrategy payment;

        if (choice == 1)
            payment = new UpiPayment();
        else
            payment = new CardPayment();

        Order order = new Order(payment);
        order.checkout(total);
    }
}