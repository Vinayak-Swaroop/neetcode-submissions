class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack();
        int[] result = new int[temperatures.length];
        Pair[] pairs=new Pair[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
            pairs[i]=new Pair(temperatures[i],i);
        for(Pair pair:pairs){
            if(stack.isEmpty() || pair.temperature<=stack.peek().temperature){
                stack.push(pair);
                continue;
            }
            while(!stack.isEmpty() && stack.peek().temperature<pair.temperature){
                Pair top=stack.pop();
                int days = pair.index - top.index;
                result[top.index] = days;
            }
            stack.push(pair);
        }
        return result;
    }
}
class Pair
{
    int temperature;
    int index;
    Pair(int temperature,int index){
        this.temperature=temperature;
        this.index=index;
    }
}
