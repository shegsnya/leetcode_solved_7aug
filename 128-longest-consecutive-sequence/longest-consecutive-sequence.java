class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i =0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int maxcount=0;
        for(int ele:hs){
            if(!hs.contains(ele-1)){
                int count=1;
                int curele=ele;
                while(hs.contains(curele+1)){
                    count=count+1;
                    curele++;
                }
           maxcount=Math.max(maxcount,count);
            }
        }
   return maxcount; }
}