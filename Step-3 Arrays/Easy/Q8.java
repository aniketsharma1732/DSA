public class Q8{

    public static int BinarySearch(int[] nums, int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
        

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target=3;
        System.out.println(BinarySearch(nums, target));
        
    }
}