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
        
        String rev = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        for(int i = 0;i<rev.length();i++)
        {
            char ch1 = rev.charAt(i);
            char ch2 = rev.charAt(rev.length() - 1 - i);

            if(ch1 != ch2)
            {
                return false;
            }
        }

        return true;
    }
}
