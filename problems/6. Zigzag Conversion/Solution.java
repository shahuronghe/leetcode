class Solution {
    public String convert(String s, int numRows) {
        String[] zip = new String[numRows];
        for(int k = 0; k < zip.length; k++){
            zip[k] = "";
        }
        int gap = numRows;
        int t = 0;
        int i = 0;
        while(t != s.length()){
            int index = i%numRows;
            String str = String.valueOf(s.charAt(t));
            if(index==numRows-1){
                gap--;
            }
            if(gap==numRows){
                zip[index] += str;
                t++;
            } else {
                if(index == gap){
                    zip[index] += str;
                    t++;
                } else {
                    zip[index] += " ";
                }
            }
            i++;
            
            if(gap==0){
                gap = numRows;
            }
        }
        String retStr = "";
        for(int k = 0; k < zip.length; k++){
            retStr += zip[k];
        }
        return retStr.replaceAll("\\s+","");
    }
}