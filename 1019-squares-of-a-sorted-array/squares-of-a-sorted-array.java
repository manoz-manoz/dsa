class Solution {
    public int[] sortedSquares(int[] arr) {
        int i,j;
        // if(arr.length%2==0)
        // {
        //         i,j=arr.length/2;
        // }
        // else
        // {
        //     i=arr.length/2;
        //     j=arr.length/2+1;
        // }
        i=0;
        j=arr.length-1;
        while(i<=j)
        {
            if((Math.abs(arr[i]))<arr[j])
            {
                arr[i]=arr[i]*arr[i];
                i++;
            }
            else
            {
                arr[j]=arr[j]*arr[j];
                j--;
            }
        }
        Arrays.sort(arr);
        return arr;

        
    }
}