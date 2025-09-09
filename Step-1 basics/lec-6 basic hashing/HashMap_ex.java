import java.util.HashMap;


public class HashMap_ex{

    public static void duplicates(int[] nums){
        HashMap <Integer, Integer> Map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(Map.containsValue(nums[i])){
                System.out.println(nums[i]+" is already there");
                
            }

            Map.put(i,nums[i]);
        }

        

    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,4,5,5,6};
        duplicates(nums);
        

    }
}