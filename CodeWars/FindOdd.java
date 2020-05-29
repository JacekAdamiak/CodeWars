package CodeWars;


// Given an array, find the integer that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.

public class FindOdd {

    public static void main(String[] args) {
        int[] list = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
//        int[] list = {20,1,1,2,2,3,3,5,5,4,20,4,5};
//        int[] list = {10};

        System.out.print(findIt(list));
    }

    public static int findIt(int[] a) {
        int odd = 0;
        int counter;
        for (int i=0; i<a.length; i++) {
            int ifOddElement = a[i];
            counter = 0;
            for (int j=0; j<a.length; j++) {
                if (ifOddElement == a[j]) {
                    counter++;
                }
            }
            if (counter % 2 == 1) {
                odd = ifOddElement;
            }
        }
        return odd;
    }
}
