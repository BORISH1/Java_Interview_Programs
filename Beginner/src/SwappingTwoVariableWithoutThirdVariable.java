public class SwappingTwoVariableWithoutThirdVariable {
    public static void main(String[] args) {
        int a= 10 , b = 20; // usong XOR concept
        a ^=b;
        b ^=a;
        a ^=b;
        System.out.println(a+ " " +b);
    }
}
