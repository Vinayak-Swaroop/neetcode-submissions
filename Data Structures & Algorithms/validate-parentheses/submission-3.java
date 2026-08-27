class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        char[] stack = new char[s.length()];
        var closingBrackets = new HashMap<Character, Character>();
        closingBrackets.put(')', '(');
        closingBrackets.put('}', '{');
        closingBrackets.put(']', '[');

        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack[++top] = s.charAt(i);
                    break;
                default:
                    if (top == -1 || stack[top] != closingBrackets.get(s.charAt(i)))
                        return false;
                    else
                     top--;
            }
        }
        if (top > -1)
            return false;
        return true;
    }
}
