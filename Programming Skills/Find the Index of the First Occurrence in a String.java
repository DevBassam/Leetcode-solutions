class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder hs = new StringBuilder(haystack);
        return hs.indexOf(needle);
    }
}
