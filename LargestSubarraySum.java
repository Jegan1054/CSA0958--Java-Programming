
import java.util.Scanner;
public class LargestSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        int maxSum = maxSubArray(nums);
        System.out.println("The sum of the subarray with the largest sum is: " + maxSum);
    }
}
