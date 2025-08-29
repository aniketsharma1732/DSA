import java.util.Arrays;

public class InsertionSort{
    public static void sorting(int a[], int n){
        for(int i=1; i<n; i++){
            int current=a[i];
            int j=i-1;
            while(j>=0 && a[j]>current){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int n=a.length;
        sorting(a,n);
        System.out.println(Arrays.toString(a));
        
    }
}