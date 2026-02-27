import java.util.*;
class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer i:arr)
            list.add(i);
            int i=0;
            int j=arr.length-1;
            while(i<j)
            {
                int item1=arr[i];
                int item2=target-arr[i];
                if(list.contains(item2))
                if(list.indexOf(item1)!=list.lastIndexOf(item2))
                  
                    return new int[]{i,list.lastIndexOf(item2)};
                    
                    i++;
            }
            return new int[]{};
    }
}