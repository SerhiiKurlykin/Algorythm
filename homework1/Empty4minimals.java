package org.example.homework1;

public class Empty4minimals {

    public static void main(String[] args) {
        int[] nums = {0, -23, 4, 53, 4, 345, 5, 0, 5, 7};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        int min1 = Integer.MAX_VALUE;;
        int min2 = Integer.MAX_VALUE;;
        int min3 = Integer.MAX_VALUE;;
        int min4 = Integer.MAX_VALUE;;

        for (int num : nums) {
            if (num <= min1) {
                min4 = min3;
                min3 = min2;
                min2 = min1;
                min1 = num;
            } else if (num <= min2 && num != min1) {
                min4 = min3;
                min3 = min2;
                min2 = num;
            } else if (num <= min3 && num != min1 && num != min2) {
                min4 = min3;
                min3 = num;
            } else if (num <= min4 && num != min1 && num != min2 && num != min3) {
                min4 = num;
            }
        }

        System.out.println("Минимум 1: " + min1);
        System.out.println("Минимум 2: " + min2);
        System.out.println("Минимум 3: " + min3);
        System.out.println("Минимум 4: " + min4);

        return min1;
    }
}
