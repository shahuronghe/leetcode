class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        while (p1 >= 0 || p2 >= 0) {
            int sum = carry;
            if(p1 >= 0){
                sum += Integer.parseInt(String.valueOf(num1.charAt(p1--)));
            }
            if(p2 >= 0){
                sum += Integer.parseInt(String.valueOf(num2.charAt(p2--)));
            }
            int actNum = sum % 10;
            carry = sum / 10;
            //System.out.println(actNum);
            sb.append(actNum);
        }
        
        if(carry != 0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}