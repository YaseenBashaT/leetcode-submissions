class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] resultArr = new int[n];
            int leftProduct = 1;
            int rightProduct = 1;
        
            for (int i = 0; i < n; i++) {
                resultArr[i] = leftProduct;
                leftProduct *= nums[i];
            }
            
            for (int i = n - 1; i >= 0; i--) {
                resultArr[i] *= rightProduct;
                rightProduct *= nums[i];
            }

        return resultArr;
    }
}  
