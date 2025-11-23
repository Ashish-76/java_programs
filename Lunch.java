public class Lunch {
   
    static String sabji = "Paneer lababedar";
    int lachhha_paratha;

    public Lunch(int lachhha_paratha) {
        this.lachhha_paratha = lachhha_paratha;
    }

    public void printState() {
        System.out.println("paratha: " + lachhha_paratha + ", Sabji: " + sabji);
    }

    public static void main(String[] args) {
        Lunch lunch1 = new Lunch(3);
        Lunch lunch2 = new Lunch(5);

        lunch1.printState(); 
        lunch2.printState(); 
        Lunch.sabji = "mashroom do pyaza";
        lunch1.printState(); 
        lunch2.printState(); 
    }
}