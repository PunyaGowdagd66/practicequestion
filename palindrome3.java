class palindrome3{
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==reverse( x))//reverse() is still not defined in your class
        {
            return true;
        }
        return false;
    }
//add this pblic reverse function
public int reverse(int x){
    int rev=0;
    while(x>0){
        int digit=x%10;//gives the last digit 
        rev=rev*10+digit;//add it to new number
        x=x/10;//removes the last digit
    }
    return rev;
    }
}