public class FactorianOfANumber {
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();
        long fact = 1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
