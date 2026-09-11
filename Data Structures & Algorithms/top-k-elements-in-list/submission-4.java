class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap();
        for(int num:nums){
            frequencyMap.putIfAbsent(num,0);
            frequencyMap.put(num,frequencyMap.get(num)+1);
        }
        List<Integer>[] frequencyArray = new List[nums.length+1];
        frequencyMap.forEach((val,frequency)->{
            if(frequencyArray[frequency]==null)
                frequencyArray[frequency]=new ArrayList();
            frequencyArray[frequency].add(val);
        });
        int[] result = new int[k];
        int listPointer=frequencyArray.length-1;
        for(int i=0;i<result.length;){
            var currentList = frequencyArray[listPointer--];
            if(currentList==null)
                continue;
            for(int num:currentList){
                result[i++]=num;
                if(i>=result.length)
                    break;
            }
        }
        return result;
    }
}
