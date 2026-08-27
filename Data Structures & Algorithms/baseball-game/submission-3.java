class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int top = -1;
        for (String oper : operations) {
            switch (oper) {
                case "+":
                    int num1 = scores[top - 1] + scores[top];
                    scores[++top] = num1;
                    break;
                case "C":
                    top--;
                    break;
                case "D":
                    int num2 = scores[top] * 2;
                    scores[++top] = num2;
                    break;
                default:
                    int num = Integer.parseInt(oper);
                    scores[++top] = num;
            }
        }
        int sum = 0;
        for(int i=0;i<=top;i++){
            sum+=scores[i];
        }
        return sum;
    }
}