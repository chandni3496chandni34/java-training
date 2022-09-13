public class diamondpat {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=5;j<i;j--)
            {
                System.out.println(" ");

            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.println("*");
                //System.out.println("\n");

            }
            System.out.println("\n");
        }
        for(i=4;i<=1;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.println(" ");

            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.println("*");
                //System.out.println("\n");

            }
            System.out.println("\n");
    }
    
    }
}
