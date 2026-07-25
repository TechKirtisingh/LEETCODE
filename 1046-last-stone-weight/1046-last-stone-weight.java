class Solution {
    public int lastStoneWeight(int[] stones) 
    {
// Max Priority Queue  // getting max ele

        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones ) // adding the elements(stones) to pq
        {
            pq.add(ele);
        }
        while(pq.size()>1) // tb tk nikalo jb tk size 1 na ho jaye
        {
            int max = pq.remove(); // jo 1st ele hoga wahi max hoga
            int smax = pq.remove();

            int nstone = max - smax; // new stone get

            if(nstone!=0) // if new stone is not distroy 
            {
                pq.add(nstone); // add pq
            }
        }
        if(pq.size()==0) 
        {
            return 0;
        }
        else
        {
           return pq.remove();
        }
    }
}