class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Pair[] pairs = new Pair[temperatures.length];
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            Pair pair = new Pair(temperatures[i], i);
            pairs[i] = pair;
        }
        int j = 0;
        Stack<Pair> stack = new Stack();
        for (int i = 0; i < pairs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(pairs[i]);
                continue;
            }
            if (pairs[i].temperature <= stack.peek().temperature)
                stack.push(pairs[i]);
            else {
                while (!stack.isEmpty() && pairs[i].temperature > stack.peek().temperature) {
                    var pair = stack.pop();
                    result[pair.index] = pairs[i].index - pair.index;
                }
                stack.push(pairs[i]);
            }
        }
        return result;
    }
}
class Pair {
    int temperature;
    int index;
    Pair(int temperature, int index) {
        this.temperature = temperature;
        this.index = index;
    }
}
