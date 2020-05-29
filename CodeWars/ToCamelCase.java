package CodeWars;

import java.lang.StringBuilder;

//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
// The first word within the output should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).

//Examples
//toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
//toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"


public class ToCamelCase {

    public static void main(String[] args) {
        String str = "the-stealth-warrior";
        System.out.print(toCamelCase(str));
    }

    static String toCamelCase(String s){
        String newS = "";
        try {
            StringBuilder sB = new StringBuilder(newS);
            sB.append(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '-' && s.charAt(i) != '_') {
                    sB.append(s.charAt(i));
                } else {
                    i++;
                    sB.append(Character.toUpperCase(s.charAt(i)));
                }
            }
            newS = sB.toString();
            s = newS;
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        return s;
    }
}
