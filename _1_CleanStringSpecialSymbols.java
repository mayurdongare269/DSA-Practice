import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class _1_CleanStringSpecialSymbols {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // StringBuilder result = new StringBuilder();
        boolean[] rmv = new boolean[s.length()];
        // boolean[] used = new boolean[s.length()];


        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '#' || c == '$'  || c == '*') {
                rmv[i] = true;

                for(int j = i + 1; j < s.length(); j++) {
                    if(!rmv[j] && Character.isLetter(s.charAt(j))) {
                        rmv[j] = true;
                        // used[j] = true;
                        break;
                    }
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!rmv[i]) {
                res.append(s.charAt(i));
            }
        }

        System.out.println(res.toString());


        // int i = 0; // gives wrong output
        // while(i < s.length()) {
        //     char c = s.charAt(i);

        //     if(c == '#' || c == '$' || c == '*') {
        //         i++;
                

        //         if(i < s.length() && Character.isLetter(s.charAt(i))) {
        //             i++;
        //         }
        //     } else {
        //         result.append(c);
        //         i++;
        //     }
        // }

        
        // System.out.println(result.toString());
    }
}


//que - on adobe hackathon demo
/* Problem Statement
You are given a string S consisting of a list of words; the string contains lowercase alphabets and some special symbols such as (*, $, #). Now, our task is to make the string good, and this is done by removing all the special characters from the sentence. For this, we have to perform two operations-

Firstly, choose the special symbol in the given sentence.
In the second step, remove the special symbol and the closest alphabets present to the right of that special character.
Input Format
The first and only line of the input contains the string S.

Output Format
Print the excellent sentence obtained after performing the operations.

Constraints
1<= S.length <=106

S[i] is the lowercase alphabet and the special symbols(*, $ and #).

Sample Testcase 1
Testcase Input
thw$ g##bjhdwd vdg*gh$vvdd#bdudhc
Testcase Output
thw hdwd vdghvdddudhc
Explanation
Given the string S.
Iterate the entire string, check for the characters that are special symbols, and then delete it along with the nearest alphabets present to the right.
Finally, return the string obtained after all the deletions.

Sample Testcase 2
Testcase Input
$sgsbd**hg
Testcase Output
gsbd
Explanation
Given the string "$sgsbd**hg", start from the right and remove each special symbol along with the closest alphabet to the right of it. After removing the special symbols * and the nearest characters h and g, we get the string "gsbd". 
*/