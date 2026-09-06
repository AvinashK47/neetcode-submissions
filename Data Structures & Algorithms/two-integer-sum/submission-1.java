class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                arr[1] = i;
                arr[0] = map.get(complement);
                break;
            }
            map.put(nums[i], i);
        }
        return arr;






















        // Map<Integer,Integer> map =  new HashMap<>();
        // for (int i =0;i<nums.length;i++){
        //     if(map.containsKey(target-nums[i])){
        //         return new int[]{i,map.get(target-nums[i])};
        //     }
        //     map.put(nums[i],i);
        // }
        // return new int[]{};
    }
}