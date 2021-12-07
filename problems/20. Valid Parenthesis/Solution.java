class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        
        String[] paren = s.split("");
        for(String p : paren){
            if(p.equals("(") || p.equals("[") || p.equals("{")){
                stack.push(p);
            } else {
                if(stack.empty())
                    return false;
                String top = stack.peek();
                if(p.equals(")")){
                    if(top.equals("(")){
                        stack.pop();
                    }  else {
                        return false;
                    }
                }
                
                if(p.equals("]")){
                    if(top.equals("[")){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                
                if(p.equals("}")){
                    if(top.equals("{")){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if(stack.empty())
            return true;
        return false;
    }
}