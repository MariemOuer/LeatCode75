//QUESTION; Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//Example 1:
//Input: nums = [1, 2, 3, 3]
//Output: true
//Example 2:
//Input: nums = [1, 2, 3, 4]
//Output: false



//-------- solution 1 ------------//
// not the most optimal but it is my solution

class Solution {
    public boolean hasDuplicate(int[] nums) {
    for (int i=0; i<nums.length; i++){// for each value of i
        for( int j=0;j<nums.length; j++){ // J will compare that value to each value in the array 
            if(nums[i]==nums[j]&& i !=j)
                return true;
        }
    }
    return false;
    }
}
// time complexity here is o(n^2)



// How to make this more optimal we can 
//      1. sort first so you can find your duplicates faster 
//      2. now your complexity is o(nlogn)

//Most optimal solution is to use a hashset 
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}
