class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder num = new StringBuilder(String.valueOf(x));
        String original = num.toString();
        num.reverse();
        return original.equals(num.toString());
    }
}
