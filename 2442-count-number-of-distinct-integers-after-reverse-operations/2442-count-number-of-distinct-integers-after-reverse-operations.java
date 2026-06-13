class Solution {
    public int reverse(int nums) {
        int r=0;
        while(nums>0){
            r=r*10+nums%10;
            nums=nums/10;
        }
        return r;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int arr:nums){
            set.add(arr);
            set.add(reverse(arr));
        }
        return set.size();
    }
}