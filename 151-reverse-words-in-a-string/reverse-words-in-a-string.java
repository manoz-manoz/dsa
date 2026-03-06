class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ss[]=s.split("\\s+");
        s="";
        for(int i=ss.length-1;i>=0;i--)
        {
            s=s+ss[i];
            if(i!=0)
            s+=" ";
           
           
        }


    return s;
        
    }
}