class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;int five=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five=five+1;
            }
            else if(bills[i]==10){
                if(five>=1){
                    five=five-1;
                    ten=ten+1;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten>=1 && five>=1){
                    ten=ten-1;
                    five=five-1;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }

            }


        }
   return true; }
}