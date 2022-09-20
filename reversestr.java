
public class reversestr {
    public static void main(String[]arg){
        String n="chandni",rev=" ";
        int l;
        l=n.length();
        for(int i=l-1;i>=0;i--){
            rev=rev+n.charAt(i);
            
    }
    System.out.println(rev);
}
    
}
