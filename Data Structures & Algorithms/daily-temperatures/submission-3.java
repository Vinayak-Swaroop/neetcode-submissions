class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Pair[] pairs = new Pair[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
            pairs[i]=new Pair(temperatures[i],i);
        Stack<Pair> stack = new Stack();
        for(Pair pair:pairs){
            while(!stack.isEmpty() && stack.peek().temperature<pair.temperature){
                Pair lower = stack.pop();
                result[lower.index]=pair.index-lower.index;
            }
            stack.push(pair);
        }
        return result;
    }
}
class Pair{
    int temperature;
    int index;
    Pair(int a,int b){
        temperature=a;
        index=b;
    }
}
