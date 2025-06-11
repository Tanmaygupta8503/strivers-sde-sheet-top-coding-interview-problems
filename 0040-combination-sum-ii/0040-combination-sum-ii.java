class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        combinationSum(0 , candidates , target , new ArrayList<>() , list);
        return new ArrayList<>(list);
    }
    private void combinationSum(int idx , int nums[] , int target , List<Integer> temp , List<List<Integer>> list){
        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return ;
        }
        if(target < 0){
            return ;
        }
        for(int i = idx ; i < nums.length ; i ++) {
            if(i > idx && nums[i] == nums[i - 1]) continue;
            if(target - nums[i] >= 0){
                temp.add(nums[i]);
                combinationSum(i + 1 , nums , target - nums[i], temp , list);
                temp.remove(temp.size() - 1);
            }
        }
    }
}