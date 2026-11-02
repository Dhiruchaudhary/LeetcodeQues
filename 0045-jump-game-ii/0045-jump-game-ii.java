class Solution {
    public int jump(int[] nums) {
        int maxindex = 0;
        int currindex=0;
        int jumps = 0;
      

        for(int i=0;i<nums.length-1;i++){
 
            maxindex = Math.max(maxindex,i+nums[i]);
           
            if(i==currindex){
                jumps++;
                currindex = maxindex;
                
            }
        }
        return jumps;

    }
}