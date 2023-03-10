import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = " ";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(solution.lengthOfLongestSubstring(s));
    }



}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        if (s.length() == 1){
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (set.contains(s.charAt(j))){
                    max = (j-i)>max?(j-i):max;
                    break;
                }else {
                    set.add(s.charAt(j));
                }
                max = set.size()>max?set.size():max;
            }
            set.clear();
        }
        return max;
    }
}
