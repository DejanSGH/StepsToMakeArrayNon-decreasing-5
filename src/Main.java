import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{10,6,5,10,15};//10,6,5,10,15  -  5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11
        int totalSteps;
        totalSteps = totalSteps(nums);
        System.out.println(totalSteps);
    }

    public static int totalSteps(int[] nums) {
        int p = 1;
        int segmentCounter = 0;
        int numOfSteps = 0;

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[p] > nums[i-1]){
                numOfSteps++;
            }
            else
            {
                p = i+1;
            }
        }
        if(numOfSteps == 0){
            return 0;
        }
        return numOfSteps;
    }

    public static boolean isItDcreasing(ArrayList<Integer> numsList) {
        for (int i = 0; i < numsList.size() - 1; i++) {
            if (numsList.get(i) > numsList.get(i + 1)) return true;
        }
        return false;
    }
}
