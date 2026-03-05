public class stringcompress {

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int index = 0;
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;

            } else {
                
                
                if (count > 1) {
                    
                    String couString = String.valueOf(count);
                    chars[index] = chars[i];
index++;
                    for (char s : couString.toCharArray()) {
                        chars[index++] = s;
                    }
                    
                } else {
                    chars[index] = chars[i];
index++;
                }
                count = 1;
            }

        }
        for (int i = 0; i < index; i++) {
            System.out.print(chars[i] + " ");
        }
    }

}
