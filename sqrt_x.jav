 //Finding square root without using functions but with binary search
class Solution {
    public int mySqrt(int x) {
         int start=1;
        int end=x;
        if(x==0)
        {
            return 0;
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<=x/mid) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
}
