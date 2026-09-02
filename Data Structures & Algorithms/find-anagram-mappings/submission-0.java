class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer,Integer> positions = new HashMap<>(); 
        int[] result = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            positions.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            result[i]=positions.get(nums1[i]);
        }
        return result;
    }
}
