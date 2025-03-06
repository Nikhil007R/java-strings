import java.util.Scanner;

class CompareStrings {

    public static boolean isEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String Substring(int start, int end, String str) {
        if (start == end) {
            return str;
        }
        String ans = "";
        for (int i = start; i < end; i++) {
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter first String: ");
        String str1 = sc.next();
        System.out.println("Enter second String: ");
        String str2 = sc.next();

        // calling the method
        boolean result = isEqual(str1, str2);

        System.out.println("After comparing two strings with charAt()");
        System.out.println(result);
        System.out.println("After comparing two strings with .equals()");
        System.out.println(str1.equals(str2));

        // taking input from user for starting and ending of a number
        System.out.println("Enter starting and ending index: (end exclusive)");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("substring using charAt(). ");
        System.out.println(Substring(start, end, str1));

        System.out.println("substring using buildIn substring(). ");
        System.out.println(str1.substring(start, end));
    }
}