public class palindrome2 {
    public String firstPalindrome(String[] words) {
       for(String word:words ){//loops through each array in string(for each loop)
       //for(datatypr single word of array:full array);
        if(isPalindrome(word)){//in this line isplanidrome is calling the function
            return word;
        }
        //palindrome is a the same forward and backward;
       } 
       return "";
    }
    public boolean isPalindrome(String s) {
    int left=0;
    int right=s.length()-1;
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){//() this are the calling function
            return false;//s.  is the object that calling the function
        }
        left++;
        right--;

    }
    return true;
    }
}
    

