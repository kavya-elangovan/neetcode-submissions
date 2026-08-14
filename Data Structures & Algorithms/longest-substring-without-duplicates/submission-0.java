class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
        int max=0;
        
        for(int i=0;i<l;i++){
            HashSet<Character> set= new HashSet<>();
            for(int j=i;j<l;j++){
                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
