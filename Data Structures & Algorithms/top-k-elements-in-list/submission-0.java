class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.putIfAbsent(nums[i], 0);
            frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
        }
        List<Integer>[] frequencyArray = new List[nums.length + 1];
        frequencyMap.forEach((num, frequency) -> {
            if(frequencyArray[frequency]==null)
                frequencyArray[frequency] = new ArrayList();
            frequencyArray[frequency].add(num);
        });
        int[] result = new int[k];
        int index = 0;
        for (int i = frequencyArray.length-1; i > 0 && index < k; i--) {
            if(frequencyArray[i]==null)
                continue;
            for (int n : frequencyArray[i]) {
                result[index] = n;
                index++;
                if (index == k)
                    break;
            }
        }
        return result;
    }
}
