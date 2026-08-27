class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        char[] stack = new char[s.length()];
        int top = -1;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(':
                case '{':
                case '[':
                    stack[++top] = s.charAt(i);
                    break;
                case ')':
                    if(top==-1 || stack[top]!='(')
                        return false;
                    else
                        top--;
                    break;
                case '}':
                    if(top==-1 || stack[top]!='{')
                        return false;
                    else
                        top--;
                    break;
                case ']':
                    if(top==-1 || stack[top]!='[')
                        return false;
                    else top--;
                    break;
                    
            }
        }
        if(top>-1)
            return false;
        return true;
    }
}
