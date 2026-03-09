class Solution {
    public int getSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            }
            else if(num > secLargest && num != largest){
                secLargest = num;
            }
        }

        if(secLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secLargest;
    }
}
