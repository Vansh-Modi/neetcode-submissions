class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[?.,';:! ]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }
}
