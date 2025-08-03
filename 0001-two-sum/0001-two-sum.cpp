class Solution {
public:
vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> hashmap; // value -> index
    for (int i = 0; i < nums.size(); ++i) {
        int diff = target - nums[i];
        if (hashmap.count(diff)) {
            return {hashmap[diff], i};
        }
        hashmap[nums[i]] = i;
    }
    return {}; // Should never reach here if there's always one solution
}
};