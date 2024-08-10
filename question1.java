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
        Set<Integer> uniques = new HashSet<>(); // set is initialization, integer is the type, hashset is called uniques 
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}

class Solution{
    public boolean hasDuplicate(int[]nums){
        set<integer> uniques = new Hashet<>();
        for(int i=0, i<numns.lenght; i++){
            if (uniques.contains(nums[i]){
                return true;
                }
            uniques.add(nums[i]);
        }
            return false;
    }
}
// How a Hash Set Works:
//Hashing: When you add an item to a hash set, it goes through a "hash function" that converts the item into a number, called a hash code. This number helps decide where the item should be placed in the set.
//Buckets: The hash set has several "buckets" or slots where items are stored. The hash code tells the hash set which bucket to use for storing the item.
//Handling Collisions: Sometimes, two different items might end up with the same hash code (a collision). Hash sets handle this by storing both items in the same bucket, but in a way that still allows you to find them efficiently.
//Why It’s Efficient:
//Fast Lookup: Because the hash code directly points to a specific bucket, finding an item is very fast—usually almost instant, no matter how many items are in the set.
//No Duplicates: Hash sets automatically ensure that only one copy of each item is stored, which is useful when you want to keep a collection of unique items.
//Examples of Use:
//Storing Unique Items: Imagine you're creating a list of all the unique words in a book. A hash set is perfect for this because it will automatically ignore any duplicate words.
//Checking Membership: If you want to quickly check if an item exists in a collection, like if a username is already taken, a hash set can tell you almost instantly.
//Removing Duplicates from a List: If you have a list with duplicates and want to remove them, you can put all the items in a hash set, which will automatically filter out the duplicates.
//Hash Set vs. Hash Table:
//Hash Set: It only stores the values, without any associated key. It’s mainly used when you just care about the existence of the value and not about associating it with anything else.
//Hash Table: This stores key-value pairs. Each key is unique, and you use the key to retrieve the associated value. For example, in a phone book, a name could be the key and the phone number the value. Hash tables are efficient for scenarios where you need to look up values based on a specific key.
