import java.util.Scanner;

public class String_Functions_App {
    public static void main(String[] args) {

        // Scanner object user se input lene ke liye
        Scanner input = new Scanner(System.in);

        // Ye main string hai jispe hum operations karenge
        String mainString = " Java Programming ";

        // Menu choice store karne ke liye variable
        int userChoice;

        do {
            System.out.println("\n------ STRING FUNCTIONS MENU ------");
            System.out.println("1. Length");
            System.out.println("2. Character at index");
            System.out.println("3. To Upper Case");
            System.out.println("4. To Lower Case");
            System.out.println("5. Equals");
            System.out.println("6. Equals Ignore Case");
            System.out.println("7. Compare To");
            System.out.println("8. Contains");
            System.out.println("9. Substring (begin index)");
            System.out.println("10. Substring (begin, end)");
            System.out.println("11. Replace");
            System.out.println("12. Trim");
            System.out.println("13. Starts With");
            System.out.println("14. Ends With");
            System.out.println("15. Index Of");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // user se choice lena
            userChoice = input.nextInt();

            switch (userChoice) {

                case 1:
                    // length() string ki total length batata hai
                    System.out.println("Length: " + mainString.length());
                    break;

                case 2:
                    // charAt() kisi index ka character deta hai
                    System.out.println("Char at index 2: " + mainString.charAt(2));
                    break;

                case 3:
                    // string ko uppercase me convert karta hai
                    System.out.println("Uppercase: " + mainString.toUpperCase());
                    break;

                case 4:
                    // string ko lowercase me convert karta hai
                    System.out.println("Lowercase: " + mainString.toLowerCase());
                    break;

                case 5:
                    // equals() exact match check karta hai (case sensitive)
                    System.out.println("Equals: " +
                            mainString.equals(" java Programming "));
                    break;

                case 6:
                    // equalsIgnoreCase() case ignore karke compare karta hai
                    System.out.println("Equals Ignore Case: " +
                            mainString.equalsIgnoreCase(" java programming "));
                    break;

                case 7:
                    // compareTo() lexicographical comparison karta hai
                    System.out.println("CompareTo 'Java': " +
                            mainString.compareTo("Java"));
                    break;

                case 8:
                    // contains() check karta hai word present hai ya nahi
                    System.out.println("Contains 'Program': " +
                            mainString.contains("Program"));
                    break;

                case 9:
                    // substring(begin) given index se end tak string deta hai
                    System.out.println("Substring from index 6: " +
                            mainString.substring(6));
                    break;

                case 10:
                    // substring(begin,end) specific part deta hai
                    System.out.println("Substring (6,17): " +
                            mainString.substring(6, 17));
                    break;

                case 11:
                    // replace() character replace karta hai
                    System.out.println("Replace a with o: " +
                            mainString.replace('a', 'o'));
                    break;

                case 12:
                    // trim() starting aur ending spaces remove karta hai
                    System.out.println("Trimmed string: '" +
                            mainString.trim() + "'");
                    break;

                case 13:
                    // startsWith() check karta hai string start me kya hai
                    System.out.println("Starts with ' Java': " +
                            mainString.startsWith(" Java"));
                    break;

                case 14:
                    // endsWith() check karta hai string end me kya hai
                    System.out.println("Ends with space: " +
                            mainString.endsWith(" "));
                    break;

                case 15:
                    // indexOf() character ka index batata hai
                    System.out.println("Index of 'P': " +
                            mainString.indexOf('P'));
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (userChoice != 0); // jab tak 0 nahi tab tak menu chalega

        input.close(); // scanner band karna important hota hai
    }
}
