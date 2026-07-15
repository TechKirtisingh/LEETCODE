class Solution {
    public int trap(int[] height) 
    {
      //  int n = height.length; // store length

// to know how much water store we need to calculate 

        int [] leftMax = new int[height.length]; //left height of the wall

        leftMax[0] = height[0];

        for(int i = 1 ; i<height.length ; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1] , height[i]); // comparing height of wall and leftmax[0] start with 0 
        }
        int[] rightMax = new int[height.length];

        rightMax[height.length-1] = height[height.length-1];

        for(int i=height.length-2 ; i>=0 ; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1] , height[i]);
        }

        int ans =0;

        for(int i=0;i<height.length;i++)
        {

// after calculating maximum from both left and right max
// then we find min of both because utna hi water store ho payega
// and the we calculate the minheigth - the actual heigth of wall so that to calculate how much water is store

            ans += Math.min(leftMax[i], rightMax[i]) - height[i]; 
        }

        return ans;
    }
}
