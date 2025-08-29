import java.util.Arrays;
public class SelectionSort {
    public static int sorting(int a[], int n){
        for(int i=0; i<n; i++){
            int minInd=i;
            
            for(int j=i+1; j<=n; j++){
                if(a[minInd]>a[j]){
                    minInd=j;
                    
                }
            }
            int temp=a[minInd];
            a[minInd]=a[i];
            a[i]=temp;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int n=a.length-1;
        sorting(a,n);
        System.out.println(Arrays.toString(a));
        
  
    }
}

// Time Complexity: O(n^2) using two loops checking till n
// Space Complexity: O(1) no extra space used changing in same array
