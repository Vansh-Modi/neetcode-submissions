class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstArr = s.toCharArray();
        char[] secondArr = t.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        return Arrays.equals(firstArr, secondArr);
    }
}
