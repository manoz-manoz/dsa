import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        
        for(int i=0;i<m+n;i++)
        {
            if(index<n)
            {
           if( nums1[i]==0)
            nums1[i]=nums2[index++];
            }
            else
            {
                break;
            }
        }
        Arrays.sort(nums1);
    }
}