
public class duplicatestring {

    public static String duplite(String s ,boolean chars[] ,int i,StringBuilder sb){

        

        if (i==s.length()) {
            return sb.toString();
            
        }

        if (chars[(s.charAt(i) - 'a')] == false) {
            sb.append(s.charAt(i));

            chars[(s.charAt(i) - 'a')] = true;
            
        }




        return duplite(s, chars, i+1,sb);


       



        
    }
    
    
    public static void main(String[] args) {
        
        String s = "abcsdksdasdjascbaj";
        boolean chars[] = new boolean[26];
        StringBuilder sb = new StringBuilder();

        System.out.println(duplite(s, chars, 0, sb)) ;    
       

        
        
        
    }
}
