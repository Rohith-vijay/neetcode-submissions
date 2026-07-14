class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for( String c:tokens){
            if(c.equals("*") || c.equals("-") || c.equals("+") || c.equals("/")){
               int b= s.pop();
               int a=s.pop();
               if(c.equals("*"))
               s.push(a*b);
               else if(c.equals("+"))
               s.push(a+b);
               else if(c.equals("-"))
               s.push(a-b);
               else if(c.equals("/"))
               s.push(a/b);

            }
            else{
                s.push(Integer.parseInt(c));
            }
        }
        return s.pop();
    }
}
