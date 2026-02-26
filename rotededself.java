public class rotededself {

    public static void searchmin(int arr[],int target ){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(right<left){
            mid=(left+right)/2;

            if (arr[mid]>=arr[left]) {

                if (arr[right]>target) {
                    left=mid+1;
                }


                
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={9,10,1,2,3,4,5,6,7,8};
        //         0,1 ,2,3,4,5,6,7,8,9


    
    }
}
