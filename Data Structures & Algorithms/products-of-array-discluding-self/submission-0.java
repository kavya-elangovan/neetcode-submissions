class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] pref = new int[l];
        int[] suff = new int[l];
        int[] curr = new int[l];
        pref[0] = 1; suff[l-1] =1;
        for(int i=1;i<l;i++){
            pref[i]= pref[i-1]*nums[i-1];
        }
        for(int i=l-2;i>=0;i--){
            suff[i]= suff[i+1]*nums[i+1];
        }
        for(int i=0;i<l;i++){
            curr[i]=pref[i]*suff[i];
        }
        return curr;
    }
}  
