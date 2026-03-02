class Solution {
    public void sortColors(int[] arr) {
       
        int j=arr.length-1;
        
        int red=0;
        int white=0;
        int blue=0;
        for(int i=0;i<j+1;i++)
        {
                if(arr[i]==0)
                    red++;
                else if(arr[i]==1)
                    white++;
                else
                    blue++;
        }
         j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(j<red)
                arr[j++]=0;
            else if(j<red+white)
                arr[j++]=1;
            else
            arr[j++]=2;
        }

       
       
    }
}