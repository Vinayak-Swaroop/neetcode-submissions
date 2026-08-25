class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        for(int j=arr.length-1;j>=0;j--){
            int temp = arr[j];
            arr[j]=max;
            if(max<temp){
                max=temp;
            }
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}