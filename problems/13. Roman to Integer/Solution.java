class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> theMap = new HashMap();
        theMap.put("I",1);
        theMap.put("V",5);
        theMap.put("X",10);
        theMap.put("L",50);
        theMap.put("C",100);
        theMap.put("D",500);
        theMap.put("M",1000);
        
        int answer = 0;
        int prevValue = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int value = theMap.get(String.valueOf(s.charAt(i)));

            if(value < prevValue && prevValue!=0){
                answer = answer - value;
            }else{
                answer = answer + value;
            }
            prevValue = value;
            
        }
        return Math.abs(answer);
    }
}