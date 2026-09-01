class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer, Integer> studentCount = new HashMap<>();
        studentCount.put(1,0);
        studentCount.put(0,0);
        for (int i = 0; i < students.length; i++) {
            studentCount.put(students[i], studentCount.get(students[i]) + 1);
        }
        System.out.println(studentCount);
        int i;
        for(i=0;i<sandwiches.length;i++){
            int availableStudents = studentCount.get(sandwiches[i]);
            if(availableStudents == 0)
                break;
            studentCount.put(sandwiches[i],studentCount.get(sandwiches[i])-1);
        }
        return sandwiches.length-i;
    }
}