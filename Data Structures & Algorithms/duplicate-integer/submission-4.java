class Solution {
    public boolean hasDuplicate(int[] nums) {

    if(nums.length<=1){
        return false;
    }else{
        HashSet<Integer> uniqueValues = new HashSet<>();

        for(int num : nums){
            if(uniqueValues.contains(num)){
                return true;
            }
            uniqueValues.add(num);
        }
        return false;
    }
        
        
    }
}