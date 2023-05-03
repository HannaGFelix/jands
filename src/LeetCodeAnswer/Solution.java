
package LeetCodeAnswer;

/** Personal answer to LeetCode question.
 * Question was to create a code that will check how many jewels is in stones.
 * */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    	
    	/**
    	 * Variable count.
    	 */
        int count=0;
        
        /**
         * First "for loop" looks at each letter of jewels.
         * Second "for loop" looks at each letter of stones.
         * Then, it will compare and count the number of matching letters.
         * In the end the code will return the number of letters matched.
         */
        for(int i=0; i<jewels.length(); i++){
            for(int s=0; s<stones.length(); s++){
                if(jewels.charAt(i)==stones.charAt(s)){
                    count++;
                }
            }
        }return count;
    }
}