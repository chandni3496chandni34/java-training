public class swap {
    public static void main(String[]arg){
        int a=20;
        int b=4;
        System.out.println(" before a = " + a + " and b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" after a = " + a + " and b = " + b);
    }
}
