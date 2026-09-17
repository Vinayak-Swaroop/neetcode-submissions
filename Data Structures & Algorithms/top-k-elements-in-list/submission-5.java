class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int num:nums){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        List<Integer>[] frequencyArray = new List[nums.length+1];
        map.forEach((num,frequency)->{
            if(frequencyArray[frequency]==null)
                frequencyArray[frequency]=new ArrayList();
            frequencyArray[frequency].add(num);
        });
        int[] result = new int[k];
        int j=0;
        for(int i=frequencyArray.length-1;i>=0;i--){
            List<Integer> list = frequencyArray[i];
            if(list==null)
                continue;
            for(int n: list){
                result[j++]=n;
                if(j==result.length)
                    return result;
            }
            if(j==result.length)
                return result;
        }
        return result;
    }
}

