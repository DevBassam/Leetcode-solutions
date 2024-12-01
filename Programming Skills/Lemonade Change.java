class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCounter = 0;
        int tenCounter = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fiveCounter++;
            }else if(bills[i] == 10 && fiveCounter >= 1){
                fiveCounter--;
                tenCounter++;
            }else if(bills[i] == 20 && tenCounter >= 1 && fiveCounter >= 1){
                fiveCounter--;
                tenCounter--;
            }else if(bills[i] == 20 && fiveCounter >= 3){
                fiveCounter -= 3;
            }else
                return false;
        }
        return true;
    }
}
