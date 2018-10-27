import java.util.Scanner;


public class NumericConversion {

    public static void println(String output) {
        System.out.println(output);
    }

    public static void print(String output){
        System.out.print(output);
    }

    public static long hexStringDecode(String hex){
        hex.toLowerCase();

        return Long.parseLong(hex);
    }

    /*public static short hexCharDecode(char digit){
        return ;
    }

    public static short binaryStringDecode(String binary){

    }

    public static String binaryToHex (String binary){

    }

*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean running = true;
        String userInput;

        /*public static long hexStringDecode(String    hex  )
        Decodes an entire hexadecimal string and returns its value.
        public static short hexCharDecode(char    digit)
        Decodes a single hexadecimal digit and returns its value.
        public static short binaryStringDecode(String binary)
         Decodes a binary string and returns its value.
         public static String binaryToHex (String    binary)
         *Decodes a binary string, re-encodees it as hexadecimal, and returns the hexadecimal string.
         */

        while (running) {

            println("Decoding Menu");
            println("-------------");
            println("1. Decode hexadecimal");
            println("2. Decode binary");
            println("3. Convert binary to hexadecimal");
            println("4. Quit");
            println("");
            print("Please enter an option: ");

            userInput = scan.next();

            switch (userInput){
                case "1":
                    print("Please enter the numeric string to convert: ");
                    userInput = scan.next();
                    hexStringDecode(userInput);
                    break;
                case "2":
                    print("Please enter the numeric string to convert: ");
                    userInput = scan.next();
                    //binaryStringDecode(userInput);
                    break;
                case "3":
                    print("Please enter the numeric string to convert: ");
                    userInput = scan.next();
                    //binaryToHex(userInput);
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    println("How the hell did you get here?");
                    break;
            }

        }
    }


}
