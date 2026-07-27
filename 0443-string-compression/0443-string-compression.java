class Solution {
    public int compress(char[] chars) 
    {
        // [a , a , b , b , b , c , d , d]
        //      i
        //          i

          int count = 1;
          StringBuilder sb = new StringBuilder("");

          sb.append(chars[0]); // sb = a (pre assigned kr diya)

        for(int i=1 ; i<chars.length ; i++) // 1 | 2 | 3 |4 | 5
        {    
          if(chars[i-1] != chars[i]) // a!=a(F) | a!=b(T) | b!=b(F) | (F) | b!=c(T)
          {
            if(count>1) // T // T
            {
                sb.append(count+""); //  sb=a2 // a2b3
            }

            sb.append(chars[i]); // sb=a2b // a2b3c
            count = 1; // count=1 // 1 
          }
          else
          {
            count++; // 2 // 2 // 3
          }
        }

        if(count>1)
        {
            sb.append(count+"");    
        }

        for (int i=0 ; i<sb.length() ; i++ )
        {
            char ch = sb.charAt(i);
            chars[i] = ch;
        }

        return sb.length();

    }
}