class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int i = 0, j = 0, k = m, rotation = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums1[i++];
            } else {
                nums1[k] = nums2[j++];
            }
            k = (k + 1) % (m + n);
        }
        while (i < m) {
            nums1[k] = nums1[i++];
            k = (k + 1) % (m + n);
        }
        while (j < n) {
            nums1[k] = nums2[j++];
            k = (k + 1) % (m + n);
        }
        while(k>0){
            rotate(nums1);
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
    private void rotate(int[] arr){
        if(arr.length<=1)
            return;
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++)
            arr[i]=arr[i+1];
        arr[arr.length-1]=temp;
    }
}