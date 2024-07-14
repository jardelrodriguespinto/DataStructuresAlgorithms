package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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
    public static boolean solve(String s)
    {

        // define 2 pointers (forward pointer and backward pointer and compare characters accordingly)
        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        int begin = 0;
        int end = arr.length - 1;

        while (begin < end)
        {
            if (arr[begin] == arr[end])
            {
                begin++;
                end--;
            }
            else
                return false;
        }

        return true;
    }

    public static int reverse(int n) {

        int reversed = 0;
        // algorithm here

        while(n != 0){
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }

        return reversed;
    }

    public static int binarySearch(int[] nums, int target){

        return -1;
    }

    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();

        Arrays.sort(words);

        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {
                if (words[j].contains(words[i]))
                    list.add(words[i]);

            }
        }


        return list;
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        Arrays.sort(letters);

        for (int i = 0; i < letters.length; i++)
        {
            if (letters[i] > target)
                return letters[i];
        }

        for (int i = 0; i < letters.length; i++)
        {
            if (letters[i] < target)
                return letters[0];
        }


        return 'a';
    }

    public static boolean halvesAreAlike(String s) {

        s = s.toLowerCase();

        int halfOfWorld = s.length() / 2;

        String firstWord = s.substring(0, halfOfWorld);
        String secondWord = s.substring(halfOfWorld, s.length());

        return amountOfVowels(firstWord) == amountOfVowels(secondWord);
    }

    public static int amountOfVowels(String str)
    {
        int count = 0;

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i ++)
        {
            boolean match = arr[i] == 'a' || arr[i] == 'e' ||
                    arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u';

            if (match)
                count++;
        }
        return count;
    }
}
