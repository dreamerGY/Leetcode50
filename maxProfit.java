
public class Solution {
public int maxProfit(int[] prices) {
    int buy=0;
    int sell=0;
    int next;
    int now;
    int length=prices.length;
    boolean wantBuy=true;
    int profit;
    int sum=0;
    
    if(length==0||length==1){
         return 0; //异常情况
    }
    
    for(int i=0;i<length-1;i++){ //从第二个价格开始        
        now=prices[i];
        next=prices[i+1];
        if(wantBuy==true){
        	if(now<next){
        		buy=now;
        		wantBuy=false;
        	}          	
        }
        else{
        	if(now>next){
        		sell=now;
        		profit=sell-buy;
        		sum=sum+profit;
        		wantBuy=true;
        		//System.out.println("buy="+buy+"  sell="+sell+"  profit="+profit);
        	}
        }      	
     }
     if(wantBuy==false){
    	sell=prices[length-1];
 		profit=sell-buy;
 		sum=sum+profit;
 		wantBuy=true;
 		System.out.println("buy="+buy+"  sell="+sell+"  profit="+profit);     	
    }
    
     return sum;              
    }
}
