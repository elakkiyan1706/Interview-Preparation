class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int la=0;
        int length=0;
        int n=0;
        int flag=0;
        while(la<s.length()){
            for(int i=st;i<=la-1;i++){
                if(s.charAt(i)==s.charAt(la)){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                la=st+1;
                st=la;
                if(length<n){
                    length=n;
                }
                n=0;
                flag=0;
            }
            else{
            n++;
            la++;
            }
        }
        if(length<n){
            length=n;
        }
        return length;
    }
}