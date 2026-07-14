class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        int sum=0;
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
           
                sum=nums[i]-nums[i-1];
                if(sum>max){
                    max=sum;
                }
        }
        return max;
    }
}