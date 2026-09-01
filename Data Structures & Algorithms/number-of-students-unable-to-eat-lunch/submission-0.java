class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studs = new ArrayDeque();
        for(int a:students){
            studs.add(a);
        }
        Stack<Integer> sands = new Stack();
        for(int j=sandwiches.length-1;j>=0;j--){
            sands.push(sandwiches[j]);
        }
        int count = 0;
        while(!sands.isEmpty()){
            //System.out.println(studs);
            //System.out.println(sands);
            if(sands.peek() == studs.peek()){
                sands.pop();
                studs.poll();
                count=0;
            }else{
                if(count==studs.size())
                    break;
                studs.add(studs.remove());
                count ++;
            }
        }
        return studs.size();
    }
}