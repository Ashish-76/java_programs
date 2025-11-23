import java.util.*;

class Exception extends Exception {
    public Exception(String message) {
        super(message);
    }
}

public class OnlineShopping {
    public static void purchaseItem(int stock, int quantity) throws Exception {
        if (quantity > stock) {
            throw new Exception("Requested quantity exceeds available stock.");
        }
        System.out.println("Purchase successful!");
    }

    public static void main(String[] args) {
        try {
            purchaseItem(5, 3);  
            purchaseItem(5, 10); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

