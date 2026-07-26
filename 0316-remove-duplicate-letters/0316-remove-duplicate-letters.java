class Solution {
    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] = i;
        }

        boolean[] present = new boolean[26];
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (!present[idx]) {

                while (!st.isEmpty()
                        && st.peek() > ch
                        && lastIndex[st.peek() - 'a'] > i) {

                    present[st.peek() - 'a'] = false;
                    st.pop();
                }

                st.push(ch);
                present[idx] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}