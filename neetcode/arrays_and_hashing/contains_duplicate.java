package arrays_and_hashing;

public class contains_duplicate {

    public static boolean duppy(int[] nums){
        for(int i=0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return(true);
                }

            }
        }
        return false;


    }

    public static void main(String[] args){
        int[] nums = {1,2,3,3};
        int[] bums = {1,2,3,4};
        int[] lums = {1,3};
        System.out.println(duppy(nums));
        System.out.println(duppy(bums));
        System.out.println(duppy(lums));
    }
}
