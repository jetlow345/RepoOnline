public class isPalindrome {
    public boolean palindrome(String word){
      //Method 1:
        char[] charArray = word.toCharArray();
       int start = 0;
       int end = word.length() - 1;
         while(start < end){
              if(charArray[start] != charArray[end]){
                return false;
              }
              start++;
              end--;
            }
            return true;
        }
       
    //     // Method 2:
    //     int i = 0;
    //     int j = word.length() - 1;
    //     while(i < j){
    //         if(word.charAt(i) != word.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
    
    public static void main(String[] args) {
        isPalindrome ip = new isPalindrome();
        if(ip.palindrome("racecar")){
            System.out.println("The word is a palindrome");
        }else{
            System.out.println("The word is not a palindrome");
        }
        // String word = "racecar";
        // System.out.println("Is the word a palindrome? " + ip.palindrome(word));
    }
}

