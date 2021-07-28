import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		if (str1.length() == str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("Given strtings are anagrams");
			}
			else {
				System.out.println("Given strtings are not anagrams");
			}
		}
		else {
			System.out.println("Given strtings are not anagrams");
		}
    }
}
