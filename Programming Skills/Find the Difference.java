class Solution {
    public char findTheDifference(String s, String t) {
        int sCode = s.chars().sum();
        int tCode = t.chars().sum();
        return (char) (tCode - sCode);
    }
}
