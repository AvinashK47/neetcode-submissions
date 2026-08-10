class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = charArray[i];
            if (Character.isLetterOrDigit(ch)) {
                arr.add(charArray[i]);
            }
        }
        int start = 0;
        int end = arr.size() - 1;
        while (start < end) {
            if (arr.get(start).equals(arr.get(end))) {
                start++;
                end--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}