class Solution {
    public int maxPower(String s) 
    {
// aabb

        int count = 1;
        int max = 1;

        for (int i =1 ; i< s.length() ; i++)
        {
            char curr = s.charAt(i); // cuur = 1 | 2 | 3
            char pre = s.charAt(i-1); // pre = 0 | 1 | 2 
            if(pre == curr) // a=a(T) | b==a(F) | b==b(T)
            {
                count ++ ; // 2 // 2
            }
            else
            {
                max = Math.max(max , count);//(1,2)=>max=2
                count = 1; // count = 1
            }
        }  

         max = Math.max(max , count); //(2,2)=>max=2

         return max; // 2

    }
}