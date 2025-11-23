public class newProg {
    public static int facto(int num){
        if(num==0){
            return 1; // Corrected: 0! = 1
        }
        else{
            return num*facto(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("facto for #5:"+facto(5));
    }
}