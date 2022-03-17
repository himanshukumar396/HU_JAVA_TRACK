import java.util.*;

public class solution_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give str1:");
        String str1 = scan.nextLine();
        System.out.println("Give str2:");
        String str2 = scan.nextLine();
        System.out.println("Give str3:");
        String str3 = scan.nextLine();

        System.out.println("Valid shuffle: " +shufflestrings(str1, str2, str3));
    }

    private static boolean shufflestrings(String str1, String str2, String CheckInString) {
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



