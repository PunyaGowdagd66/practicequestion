public class palindrome {
    public static void main(String[] args) {

        int num = 121;   // change number here
        int rev = 0;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}