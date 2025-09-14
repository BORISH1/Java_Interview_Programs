public class LeapYearChecking {
    public static void main(String[] args) {
        int y = new java.util.Scanner(System.in).nextInt();
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        System.out.println(leap ? "Leap Year" : "Not leap Year");
    }
}