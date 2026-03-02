public class stringpelindrome {
    public static void main(String[] args) {
        String str = "racecr";

        for (int i = 0; i <=str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                
                System.out.println("not a plamdrome ");
                return;
            } 
        }
        System.out.println("yes it is pelamdrome");
    }
}
