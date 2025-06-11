class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinationSum(0 , candidates , target , new ArrayList<>() , list);
        return new ArrayList<>(list);
    }
    private void combinationSum(int idx , int nums[] , int target , List<Integer> temp , List<List<Integer>> list){
        if(target == 0) {
            // Collections.sort(temp);
            list.add(new ArrayList<>(temp));
            return ;
        }
        if(target < 0){
            return ;
        }
        for(int i = idx ; i < nums.length ; i ++) {
            if(target - nums[i] >= 0){
                temp.add(nums[i]);
                combinationSum(i , nums , target - nums[i], temp , list);
                temp.remove(temp.size() - 1);
            }
        }
    }
}