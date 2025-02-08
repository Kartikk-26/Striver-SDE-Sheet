//Question Number : 53. 
//Question Name :  Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        //Declaraing the max eleemnt as the minimum element of that array
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            //initialising the first elemetn as sum
            sum+= nums[i];

            //if sum is more than max than sum=max
            if(sum>max){
                max=sum;
            }

            //if sum is less than 0 toh we have to make sum 0 so that it should not affect in max element
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}