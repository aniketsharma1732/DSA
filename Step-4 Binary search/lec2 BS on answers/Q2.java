

// find the nth  root of a number using binary search


public class Q2{
    public static int roots(int n, int number){
        int l=1; int h=number;
        while(l<=h){
            int mid = (l+h)/2;
            long val = (long)Math.pow(mid, n); // avoid overflow
            if(val==number){
                return mid;


            }else if(val>number){
                h=mid-1;
            }else if(val<number){
                l=mid+1;
            }

        }


        return -1;
    }

    public static void main(String[] args) {
        int n=3;
        int number=27;
        System.out.println(roots(n, number));
        
    }

}