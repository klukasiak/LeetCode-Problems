package p3_LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] tab = s.split("");
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tab.length; i++){
            for(int j = i; j < tab.length; j++){
                if(!sb.toString().contains(tab[j]))
                    sb.append(tab[j]);
                else
                    break;
            }
            if(sb.toString().length() > max)
                max = sb.toString().length();
            sb.setLength(0);
        }
        return max;
    }
}
