class Solution {
public:
    int singleNumber(vector<int>& nums) {
        //function complete krna h
        //vector -> array

        int ans = 0;
        int n = nums.size();
        
        for(int i=0; i<n; i++){
            ans = ans ^ nums[i];
        }
        //return kardo answer
        return ans;
    }
};



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> list =
                            Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(list);

                        set.add(list);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}