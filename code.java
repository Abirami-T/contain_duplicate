/*
Input: nums = [1,2,3,1]
Output: true
Input: nums = [1,2,3,4]
Output: false
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> number=new HashSet<Integer>();
       for(int i: nums){
           if(number.contains(i))
           return true;
           else
           number.add(i);
       }
       return false;
    }
}
