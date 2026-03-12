class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int i=0,j=0,sum=0;
        double msum=0;
        while(j<k)
        {
            sum+=arr[j];
            j++;
        }
        msum=sum;
        while(j<arr.length)
        {
            sum+=arr[j];
            sum-=arr[i];
            msum=Math.max(sum,msum);
            i++;
            j++;
        }
        return msum/k;
    }
}