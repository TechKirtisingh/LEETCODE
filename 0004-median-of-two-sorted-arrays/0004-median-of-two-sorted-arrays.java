class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] ans = merge( nums1 , nums2);

        if(ans.length %2 == 0)
        {
            double ans2 = (double)(ans[ans.length/2] + ans[ans.length/2 -1])/2;
            return ans2;
        }
        else 
        {
            double ans2 = (double) (ans[ans.length/2]);

            return ans2;
        }
    }

// First of all we merge two array then find the median

    public int[] merge(int[] arr1 , int[] arr2) // arr1 [3|6|9]  and arr2 [1|5|7|11|13]
    {
        int[] ans = new int[arr1.length + arr2.length]; // ans [1|3|5|6|7|9|11|13]

        int p1=0; // p1 is at zero index[3]
        int p2=0;// p2 is at zero index[1]
        int p3=0;

        while(p1<arr1.length || p2<arr2.length) // 
        {
            //assume Integer.MaX_Value = infinity 

            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE; // val1 = 3 | 3 | 6 | 6 
            int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE; // val2 = 1 | 5 | 5 | 7

            if(val1 <val2) // 3<1(F) | 3<5(T) | 6<5(F) |
            {
                ans[p3] = val1;
                p1++;
            }
            else // (T) | nahi chala | (T)
            {
                ans[p3] = val2; 
                p2++;
            }
            p3++;
            // 1|3|5....
        }
        return ans; 
    }
}