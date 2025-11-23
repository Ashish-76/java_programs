public class InvalidException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
public class StudentResultProcessing {
    public static void calculateGrade(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {        import java.util.*;
        
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
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
    public static void main(String[] args) {
        
            try {
               
                calculateGrade(85);
                calculateGrade(110); 
            } catch (InvalidMarksException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
