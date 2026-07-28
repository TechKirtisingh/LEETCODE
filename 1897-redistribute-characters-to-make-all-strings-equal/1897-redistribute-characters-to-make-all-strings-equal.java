class Solution {
    public boolean makeEqual(String[] words) 
    {
        //[aabb , bbaa , cccc , abcd]

// create frequence array because to check kitni baar koi letter aa raha hai

        int [] fre = new int[26]; // [ | | | | ]

        for(int i=0 ; i < words.length ; i++) // 4
       {

        //// string se taking out every words

            String w = words[i];// w=aabb | w= bbaa | w= cccc | w= abcd

        // go through words length

            for(int j=0; j<w.length(); j++)
            {

            // now in the words taking out character

                char ch = w.charAt(j);// ch=a | a | b | b | b | b | a | a |c |c |c |c|a|b|c|d
                
                int idx = (int)(ch-'a'); 
                
                // idx=  a-a=0 | a-a=0 | b-a=1 | b-a=1 | 1 | 1 |0 | 0 |3|3|3|3

                fre[idx] = fre[idx]+1; // (fre [ 1+1+1+1+1 | 1+1+1+1+1 | 1+1+1+1+1  | 1 ])
            }
       } 

       for(int i=0 ; i<fre.length ; i++)
       {

            if(fre[i] % words.length != 0) //a= 5%4 !=0 (True) | b =5%4=.....
            {
                return false; // (T)
            }
       }

        return true;

    }
}