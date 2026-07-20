class Solution {
    public String reverseWords(String s) 
    {
        String [] arr = s.split ("\\s+"); // (\\): skip and s=space and +(multiple space)

        StringBuilder sb = new StringBuilder("");

        for(int i= arr.length-1 ; i>=0 ; i--)
        {
            sb.append(arr[i] + " ");
        }

// convert Stringbuilder to String
        String ans = sb.toString();
        ans = ans.trim();

        return ans;
    }
}