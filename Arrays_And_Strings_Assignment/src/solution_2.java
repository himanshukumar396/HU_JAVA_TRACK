import java.util.*;

public class solution_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();;
        String str3 = scan.nextLine();;
        System.out.println("The given string is: " + str3);
        System.out.println("The interleaving strings are " + str1 + " and " + str2);
        System.out.println("The given string is interleaving: " + checkInterleaved(str1, str2, str3));
    }
    private static boolean checkInterleaved(String str1, String str2, String CheckInString) {
        int i = 0, j = 0, k = 0;
        if (str1.length() + str2.length() != CheckInString.length()) {
            return false;
        }
        while (k < CheckInString.length()) {
            if (i < str1.length() && str1.charAt(i) == CheckInString.charAt(k)) {
                i++;
            } else if (j < str2.length() && str2.charAt(j) == CheckInString.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        if (!(i == str1.length() && j == str2.length() && k == CheckInString.length())) {
            return false;
        }
        return true;
    }
}


