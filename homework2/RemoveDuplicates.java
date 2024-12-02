package org.example.homework.homework2;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 4, 5, 5};
        int newLength = removeDuplicates(nums);

        System.out.println("Длина нового массива: " + newLength);
        System.out.print("Измененный массив: ");
        for (int i = 0; i < nums.length; i++) {
            if (i < newLength) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }
}
