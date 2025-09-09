public class armstrong{
    public static void main(String[] args){
        int n=153;
        int original=n;
        int count=String.valueOf(n).length();
        double result=0;

        while(n>0){
            int last_digit=n%10;
            result= result + Math.pow(last_digit, count);
            n=n/10;

        
        }
        if(result==original){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        

        // count digits, 
    }
}