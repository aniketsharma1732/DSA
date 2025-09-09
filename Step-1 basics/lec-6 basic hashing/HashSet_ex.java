// import java.util.*;
import java.util.HashSet;


// printing duplcates in the array


public class HashSet_ex{

    public static void duplcates(int nums[]){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                System.out.println(nums[i]+ " " +"is already there");
            }

            set.add(nums[i]);

        }

    }

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        
        int nums[]={1,2,3,4,4,5,5,6};
        duplcates(nums);
        
        
        


        
    }
}