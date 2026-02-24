public class stocksell$buy {
    public static void main(String[] args) {
        int prices[] ={7,1,5,3,6,4};
       int buy_price =prices[0];
       int Maxprofit =0; 

       for(int i = 1; i<prices.length;i++){
        int selling_price = prices[i];
        if (buy_price<selling_price) {
             int profit =(selling_price-buy_price);
            Maxprofit=Math.max(profit, Maxprofit);
            
        }
        else{
            buy_price=selling_price;
        }


        
        
       }
       System.out.println(Maxprofit);

    }
    
}
