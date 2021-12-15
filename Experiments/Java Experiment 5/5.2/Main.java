import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        int alp = 0, dig = 0, sym = 0, bla = 0, vow = 0, con = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                alp++;
                switch (s.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        vow++;
                        break;
                    default:
                        con++;
                }
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                dig++;
            else if (s.charAt(i) == ' ')
                bla++;
            else
                sym++;
        }
        System.out.println("Number of alphabets: " + alp);
        System.out.println("Of which " + vow + " are vowels and " + con + " are consonants");
        System.out.println("Number of digits: " + dig);
        System.out.println("Number of special symbols: " + sym);
        System.out.println("Number of blank spaces: " + bla);
    }
}
