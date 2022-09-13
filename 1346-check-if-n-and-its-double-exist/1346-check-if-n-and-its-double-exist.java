class Solution {
    public boolean checkIfExist(int[] arr) {
        int index = 0;
        for(int i =0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if (arr[i]==arr[j]*2 && j != i)
                    return true;
            }
        }
        return false;
    }
}