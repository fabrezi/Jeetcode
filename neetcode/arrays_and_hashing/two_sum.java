package arrays_and_hashing;

public class two_sum {

    public static int[] twoSums(int[] nums, int target){
        for(int i=0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args){
        int[] nums = {3,4,5,6};
        int target = 7;
        int [] Answer = twoSums(nums, target);
        System.out.println("indices" + Answer[0] + "and" + Answer[1]);
    }
}
