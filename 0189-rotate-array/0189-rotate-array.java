class Solution {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr, int k) {
        int mod=k%arr.length;
        int p=arr.length-mod;
        int[] arr2=new int[arr.length];
        int pointer=p;
        for(int i=0;i<arr.length;i++){
            if(pointer==arr.length){
                pointer=0;
            }
            arr2[i]=arr[pointer];
            pointer++;
        }
        for(int i=0;i<arr.length;i++) {
        arr[i] = arr2[i];
        }
    }
}

