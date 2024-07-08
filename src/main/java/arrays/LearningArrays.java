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

    //Anagram
    public static boolean solve(char[] s1, char[] s2)
    {
        if (s1.length != s2.length)
            return false;

        boolean flag = true;

        for (int i = 0; i < s1.length; i++)
        {
            if (s1[i] == s2[i])
            {
                flag = false;
                break;
            }
        }

        return flag;
    }

    /// Palindrome Check
    public boolean solve(String s)
    {

        // define 2 pointers (forward pointer and backward pointer and compare characters accordingly)

        return false;
    }
}
