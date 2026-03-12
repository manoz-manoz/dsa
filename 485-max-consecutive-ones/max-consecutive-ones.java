class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int sum=0,msum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                msum=Math.max(sum,msum);
                sum=0;
            }
            else{
                sum=sum+arr[i];
            }
        }
            msum=Math.max(sum,msum);
            return msum;
    }
}