class Solution {

    /*
[] : Square brackets mean
"Match any one character inside."

Example:

[a-z]

means any lowercase letter.
a-z
a b c d ... z

All lowercase letters.
A-Z
A B C D ... Z

All uppercase letters.
0-9
Digits
0 1 2 3 4 5 6 7 8 9
^

Inside square brackets,

[^...]
means NOT.

So

[^a-zA-Z0-9]

means

Match every character that is NOT
-lowercase letter
-uppercase letter
-digit

So it matches

' '
','
':'
'.'
'!'
'@'
'#'
'('
')'
    */
    public boolean isPalindrome(String s) {
        
       int left = 0;
       int right = s.length() - 1;

       while(left < right)
       {
        while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
        {
            left++;
        }

        while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
        {
            right--;
        }

        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
        {
            return false;
        }

        left++;
        right--;
       }

       return true;
    }
}
