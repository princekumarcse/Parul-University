public class Practical7_a {

    static void findMaxSecondMax1D(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + secondMax);
    }


    public static void main(String[] args) {
        int[] arr1 = {10, 25, 45, 45, 30, 20};
        findMaxSecondMax1D(arr1);
    }
}