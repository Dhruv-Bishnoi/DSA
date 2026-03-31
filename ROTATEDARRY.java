public class ROTATEDARRY {

    public static void searchINarray(int arr[] , int key , int st ,int end ){
        if(end<st){
            return;
        }
       int mid = (st+end)/2;
        if(arr[mid]==key){

            System.out.println(mid);
            return;

        }
        

        if (arr[mid]>=arr[st]) {

            if(key>=arr[st] && key<arr[mid] ){
                searchINarray(arr, key,st, mid-1);
    
            }
            else{
                searchINarray(arr, key, mid+1, end);
            }

            
        }

        else{
        if(arr[mid]<key && key<=arr[end]){
            searchINarray(arr, key, mid+1, end);



        }

        else{

            searchINarray(arr, key, st, mid-1);
        }
    }

   





    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};




            searchINarray( arr , 3, 0 ,arr.length-1);
        
        
    }
}