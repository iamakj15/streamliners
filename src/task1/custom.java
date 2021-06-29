package task1;

import java.util.*;

public class custom
{
    private static String modify(String s, String replacements)
    {
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < replacements.length(); j++)
            {
                if (s.charAt(i) == replacements.charAt(j))
                {
                    char ch = replacements.charAt(j+1);
                    newString.append(ch);
                }
            }
        }
        return newString.toString();
    }
    public static boolean customException(String s, String replacements)
    {
        Set<Character> numericStringSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            numericStringSet.add(s.charAt(i));

        ArrayList<Character> numericStringArray = new ArrayList<>(numericStringSet);
        Collections.sort(numericStringArray);

        ArrayList<Character> numericReplacementsArray = new ArrayList<>();
        for (int i = 0; i < replacements.length(); i+=2)
            numericReplacementsArray.add(replacements.charAt(i));

        Collections.sort(numericReplacementsArray);

        if (!numericReplacementsArray.equals(numericStringArray))
        {
            return false;
        }

        for (int i = 1; i < replacements.length(); i += 2)
        {
            if (Character.isLetter(replacements.charAt(i)))
            {
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the numeric string to be converted: ");
        String str = s1.nextLine();

        System.out.print("Enter the replacement string: ");
        String rep = s1.nextLine();

        if(!customException(str, rep)) {
            System.out.println("ERROR: INVALID");
            return;
        }

        System.out.println("The replaces string is " + modify(str, rep.toUpperCase()));
    }
}


