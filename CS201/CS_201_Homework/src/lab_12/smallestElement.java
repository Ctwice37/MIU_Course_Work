package lab_12;

import javax.swing.*;

public class smallestElement {
    public static void main(String[] args) {
        int[] nums = {8, 5, 4, 7, 1, 4, 5, 6};                  //smallest == 1
        System.out.println(findMin(nums, 0));


    }

    public static int findMin(int[] nums, int index) {
        if (nums.length == index)
            return nums[index - 1];
        else {
            if (nums[index] < findMin(nums, index + 1))
            return nums[index];
            else
                return findMin(nums, index + 1);
        }

    }
}