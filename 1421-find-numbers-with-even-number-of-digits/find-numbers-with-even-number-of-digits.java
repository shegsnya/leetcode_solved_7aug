class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i =0;i<nums.length;i++){
            if(isevencount(nums[i])){
                total++;
            }

        }
    return total;
    }
     boolean isevencount(int number){
        int c=(int)(Math.log10(number))+1;

        
        if(c%2==0){
            return true;
        }
        return false;
    }
}