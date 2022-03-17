import java.util.*;

public class anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Getting the input string from the user

        System.out.print("Enter the First String : ");

        String str1 = scanner.nextLine();

        System.out.print("Enter the second String : ");

        String str2 = scanner.nextLine();

        if (Anagram_check(str1, str2))

            System.out.println("Both  are Anagrams");

        else

            System.out.println("Both  are NOT Anagrams");

        scanner.close();

    }

    public static boolean Anagram_check(String s1, String s2) {

        s1 = s1.replaceAll("s", "");   // Remove all the white space

        s2 = s2.replaceAll("s", "");

        if (s1.length() != s2.length())

            return false;

        else {

            char[] arr1 = s1.toLowerCase().toCharArray();  // Convert both Strings into lower case and into Character Array

            char[] arr2 = s2.toLowerCase().toCharArray();


            Arrays.sort(arr1);

            Arrays.sort(arr2);



            return (Arrays.equals(arr1, arr2));

        }

    }
}


