package arrays;

public class LearningArrays
{
    // this is the algorithm that reverses the input array (nums)
    public static int[] solve(int[] nums) {

        // hint: define 2 pointers (pointing to the last and first item of the array) and make a single iteration ...

        int count = 1;

        for (int i = 0; i < nums.length / 2; i++)
        {

            swap(nums, nums.length - count, i);
            count++;
        }

        return nums;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
