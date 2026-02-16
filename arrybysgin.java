public class arrybysgin {
    public static void main(String[] args) {
        
        int arry[] = {3,1,-2,-5,2,-4};
        int n = arry.length;
        //{3,1,-2,-5,2,-4}

        int NewArry[] =new int[n];

       
        int Pindex = 0;
        int Nindex = 1;
  
        for(int i = 0 ; i<arry.length;i++){
            if (arry[i]>=0) {
                NewArry[Pindex]=arry[i];
                Pindex+=2;

                
            }
            else{
                NewArry[Nindex]=arry[i];
                Nindex+=2;
            }
        }

   
        for(int i =0;i<NewArry.length;i++){
            System.out.println(NewArry[i]);
        }

        

    }
    
}
