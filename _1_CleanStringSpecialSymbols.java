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


        // int i = 0;
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