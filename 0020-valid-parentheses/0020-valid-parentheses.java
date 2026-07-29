class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack <>();

        // stack: Isme hum sirf opening brackets store karenge. 


        for(int i=0 ; i<s.length(); i++)
        {
            char ch = s.charAt(i);

// Agar Opening Bracket Mila hai to usse stack me daal do.

            if(ch=='(' || ch == '{' || ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }

                char top = st.pop();

// Yaha hum dekhte hain ki closing bracket ka matching opening bracket hai ya nahi.

//Agar current character ) hai,aur stack ka top ( nahi hai, to return kr dega false

                if((ch==')' && top != '(')||
                    (ch=='}' && top !='{')||
                    (ch==']' && top !='['))
                    {
                        return false;
                    }
            }
        }

        return st.isEmpty();

    }
}