class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // har 3 empty water bottel pr ek filled bottel milta hai 
        // if i have 9 bottle = 3empty hua to  ->1 filled bbottle mila same way we get 3 more filled water bottle (as we drink all 9 bottle water)
        // agar wo 3 bhi empty hue to hame 1 aur filled water bottle milega so we have---->
        // first 9 empty + sec 3 empty + 1 empty bottle we get...

        int ans = numBottles;//initally mai kitne bottle pani pie rahi hu // 9 div 3 = 3

        while(numBottles >= numExchange)
        {
            int newBottles = numBottles / numExchange ; 

            ans = ans + newBottles ; 

            int remBottles = numBottles % numExchange ;     
            numBottles = newBottles + remBottles; 
        }
        return ans;
    }
}

// numbottle =15    and  numexchange = 4
// 15 - 12(4+4+4) = 3+3(hr 4 se ek filled bottle mil jayega) = 6 - 4() = 2 (is bottle ke exchange me hame koi filled bottle nahi milega as )

// total bottle drink = 15 + 3 + 1 = 19