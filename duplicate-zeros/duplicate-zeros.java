class Solution {
    public void duplicateZeros(int[] arr) {
        int[] copiedArr = new int[arr.length];
        int index = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i]==0 && index != arr.length-1) {
                copiedArr[index+1]=0;
                index++;
            } 
            else {
                copiedArr[index]=arr[i];
            }
             if (index >= arr.length-1) {
                break;
            }
            index++;
        }
        for(int i = 0; i<copiedArr.length; i++) {
            arr[i]=copiedArr[i];
        }
    }
}