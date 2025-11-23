import java.util.Scanner;

abstract class Delivery {
    abstract void DeliveryMode();
    abstract void charges();
    double Amount;
    void CompanyInfo(){
        System.out.println("CLIIPs");
    }
    Delivery(){
        Amount=0;
    }
    Delivery(double Amount){
        this.Amount=Amount;
    }
}
     
class StandardDelivery extends Delivery{
     void DeliveryMode(){
        System.out.println("you are using standard delivery");
    }
    void charges(){
        System.out.println("Standard delivery charges: " + (Amount + (0.05 * Amount)));
    }
   
}
class ExpressDelivery extends Delivery{
    void DeliveryMode(){
        System.out.println("you are using express delivery");
    }
    void charges(){
        System.out.println("Express delivery charges: " + (Amount + 0.1 * Amount));
    }
}
public class Main{
public static void main(String[] args) {
    System.out.println("choose the mode of delivery:");
     System.out.println("1.Standard Delivery");
      System.out.println("2.Express Delivery");
       Scanner sc = new Scanner(System.in);
         int choice = sc.nextInt();
      System.out.println("Enter the amount:");
    double Amount = sc.nextDouble();
    Delivery d = new StandardDelivery();
    Delivery e = new ExpressDelivery();
    d.CompanyInfo();
    d.DeliveryMode();
    d.charges();
    e.CompanyInfo();
    e.DeliveryMode();
    e.charges();
}}