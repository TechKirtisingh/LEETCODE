class Solution {
    public int lengthOfLastWord(String s) 
    {
        String[] aword = s.trim().split("\\s+");

        return aword[aword.length - 1].length();
    }
}