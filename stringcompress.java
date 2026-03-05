public class stringcompress {
    
    public static void main(String[] args) {
        
        StringBuilder chars = new StringBuilder("aaabbcddd");
        StringBuilder newstring = new StringBuilder("");
        
        int count = 1;
        for (int i = 0; i < chars.length(); i++) {
            
            if (i < chars.length() - 1 && chars.charAt(i) == chars.charAt(i + 1)) {
                count++;
            }
            else{
                if (count>1) {
                    newstring.append(chars.charAt(i) );
                    newstring.append(count );
                    
                }
                else{
                    newstring.append(chars.charAt(i));

                }
                count = 1;
            }
            
        }
        System.out.println(newstring);
    }
    
}
