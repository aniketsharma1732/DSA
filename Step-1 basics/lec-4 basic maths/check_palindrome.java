public class check_palindrome{
    public static void main(String[] args){
        int number=1234454321;
        int reverse=0;
        int temp=number;
        while(temp>0){
            int last_digit= temp%10;
            
            reverse=reverse*10+last_digit;
            temp=temp/10;




        }

        if(reverse==number){
            System.out.println("the string is palindrome");
        }else{
            System.out.println("the string is not palindrome");

        }

    }


}