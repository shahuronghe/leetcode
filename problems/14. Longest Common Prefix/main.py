class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s1=""
        if strs is None or len(strs) ==0:
            return s1
        min=-1
        for item in strs:
            if min == -1:
                min = len(item)
            if len(item) < min:
                min = len(item)
        print(min)
        for i in range(0, min):
            current = strs[0][i]
            for j in range(0,len(strs)):
                if strs[j][i] != current:
                    return s1
            s1+=current        
        return s1
                
                
            