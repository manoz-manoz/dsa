import java.util.*;
class Solution {
    public int[] sortedSquares(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int temp[]=new int[arr.length];
        for(int index=arr.length-1;index>=0;index--)
        {
            if(Math.abs(arr[i])>arr[j])
            {
                    temp[index]=arr[i]*arr[i];
                    i++;
            }
            else
            {
                temp[index]=arr[j]*arr[j];
                j--;
            }
        }
       return temp;
        
    }
}