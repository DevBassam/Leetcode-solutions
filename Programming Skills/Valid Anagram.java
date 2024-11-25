class Solution {
  /*
  I used the frequancy_array way to solve the problem.
  If the frequancy of a letter is 0  that means the letter did not appear in both strings
  OR appear in both strings,
  BUT if the frequancy of a letter is more or less than zero that means the letter appears in just one of them.
  */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] letter_freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            letter_freq[s.charAt(i) - 'a']++;
            letter_freq[t.charAt(i) - 'a']--;
        }
        for(int freq : letter_freq){
            if(freq != 0) return false;
        }
        return true;
    }
}
