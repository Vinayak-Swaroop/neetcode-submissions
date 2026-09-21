class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            freqMap.putIfAbsent(nums[i],0);
            freqMap.put(nums[i],freqMap.get(nums[i])+1);
        }
        List<Integer>[] frequencies = new List[nums.length+1];
        freqMap.forEach((num,freq)->{
            if(frequencies[freq]==null)
                frequencies[freq]=new ArrayList();
            frequencies[freq].add(num);
        });
        int[] result = new int[k];
        int j=0;
        for(int i=frequencies.length-1;i>=0;i--){
            List<Integer> list = frequencies[i];
            if(list==null)
                continue;
            for(int num:list){
                result[j++]=num;
                if(j==result.length)
                    return result;
            }
        }
        return result;
    }
}
