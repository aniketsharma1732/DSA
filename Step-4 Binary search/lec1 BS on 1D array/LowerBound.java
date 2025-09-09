public class LowerBound{
    public static int lowerBound(int[] arr, int x) {
        int l = 0, h = arr.length - 1;
        int ans = arr.length;  // default = not found, return size
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] >= x) {
                ans = mid;    // possible answer
                h = mid - 1;  // look left
            } else {
                l = mid + 1;  // look right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 2;
        System.out.println(lowerBound(arr, x));  // 1
        System.out.println(lowerBound(arr, 0));  // 0
        System.out.println(lowerBound(arr, 6));  // 5 (arr.length)
    }
    
}
