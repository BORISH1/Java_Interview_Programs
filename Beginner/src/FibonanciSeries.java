public class FibonanciSeries {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a + (i<n-1?" ":" "));
            long c = a+b; a=b ; b=c;
        }
    }
}