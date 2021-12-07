class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1 ) return nums.length;

        int k = 0;
        int pointer = 1;
    
        while ( pointer < nums.length ){
            if (nums[k] != nums[pointer]){
                nums[++k] = nums[pointer];
                
            }
            pointer++;
        }
        System.out.println(Arrays.toString(nums));
        
        return k+1;
    }
}