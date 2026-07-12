class Solution {
    public boolean isValid(String s) {
        Stack<Character> p=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c == '{'|| c=='[')
             p.push(c);
        
            else{
                if(p.isEmpty()){
                    return false;
                }
                char top=p.pop();
                if((c=='}' && top!='{') || (c==')' && top!='(') || (c==']' && top!='[')){
                    return false;
                }
            }
        }
        return p.isEmpty();

            }
}
