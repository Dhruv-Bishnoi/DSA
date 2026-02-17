public class reversestring {
    public static void main(String[] args) {

        String word = "hello word";


        String newword[] = word.split(" ");

        StringBuilder sb = new StringBuilder();
        
        for(int i = newword.length-1;i>=0;i--){
            sb.append(newword[i]);


            if (i!=0) {
                sb.append(" ");

            }

        }
        System.out.println(sb.toString());
    }
}

