package org.example.homework1;

 public static void main(String[] args) {
        int[] nums = {-5, -5, 0, 23, 60, 8, 62, 345, 5};

        int[] result = findMin(nums);
        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Второе минимальное значение: " + result[1]);
        System.out.println("Третье минимальное значение: " + result[2]);
        System.out.println("Четвёртое минимальное значение: " + result[3]);
    }

    private static int[] findMin(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int min4 = Integer.MAX_VALUE;

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


        return new int[]{min1, min2, min3, min4};
    }
}
