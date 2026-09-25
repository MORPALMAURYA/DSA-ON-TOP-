class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans;
        int n = nums.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] + nums[j] ==  target) {
                    ans.push_back(i);
                    ans.push_back(j);
                    return ans;
                }
            }
        }
        return ans;
    }
};

// using java

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i<nums.length; i++){
          for(int j = i+1; j<nums.length; j++){
            if(nums[i] + nums[j] == target){
                 return new int[] {i,j};

            }
          }
        }
        return new int[] {-1,-1};

    }
}