class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s ==null || s.length()==0 || s.equals(""))
            return 0;
        Set<String> store = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        int count = 0;
        while(end < s.length()){
            if(store.add(String.valueOf(s.charAt(end)))){
                end++;
                max = Math.max(max,store.size());
            }else{
                store.remove(String.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
}