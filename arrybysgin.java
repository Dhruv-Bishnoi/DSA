public class arrybysgin {
    public static void main(String[] args) {
        
        int arry[] = {3,1,-2,-5,2,-4};
        int n = arry.length;

        int positive[] =new int[n];

        int nagitive[] = new int[n] ;
        int Pindex = 0;
        int Nindex = 0;
  
        for(int i = 0 ; i<arry.length;i++){
            if (arry[i]>=0) {
                positive[Pindex]=arry[i]; 
                positive[Pindex+1]=0; 
                Pindex+=2;

                
            }
            else{
                nagitive[Nindex]=0;
                nagitive[Nindex+1]=arry[i];
                Nindex+=2;
            }
        }

        for(int i = 0 ; i <arry.length;i++){
            if(i%2==0){
                arry[i]=positive[i];
            }
            else{
                arry[i]=nagitive[i];
            }
        }
        for(int i =0;i<arry.length;i++){
            System.out.println(arry[i]);
        }

        

    }
    
}
