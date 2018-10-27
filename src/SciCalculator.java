import java.util.Scanner;

public class SciCalculator {
    //create menu
    public static void menu() {

            System.out.println("\nCalculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average\n");
    }

    public static void main(String[] args) {
        //initialize variables
        double firstVar;
        double secondVar;
        double result = 0.0;
        double sumResults = 0.0;
        double numCalculations = 0.0;

        // display result and call Menu

        System.out.println("Current Result: " + result);

        menu();
        //set up while loop for operations
        int operation = 1;

        while (operation > 0) {

            // Receive Operation
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Menu Selection: ");
            operation = input.nextInt();
            if (operation > 7) {
                System.out.println("Error: Invalid selection!");
                return;
            }
            if (operation < 0) {
                System.out.println("Error: Invalid selection!");
                return;
            }


            // Operations using switch statements

            switch (operation) {
                case 0: //exit
                    System.out.print("Thanks for using this calculator. Goodbye!");
                    return;

                case 1: // Addition
                    System.out.print("Enter first operand: ");
                    firstVar = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondVar = input.nextDouble();
                    result = firstVar + secondVar;
                    numCalculations = numCalculations + 1;
                    sumResults = sumResults + result;
                    System.out.println("Current Result: " + result);
                    menu();
                    break;


                case 2: // Subtraction
                    System.out.print("Enter first operand: ");
                    firstVar = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondVar = input.nextDouble();
                    result = firstVar - secondVar;
                    numCalculations = numCalculations + 1;
                    sumResults = sumResults + result;
                    System.out.println("Current Result: " + result);
                    menu();
                    break;


                case 3: // Multiplication
                    System.out.print("Enter first operand: ");
                    firstVar = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondVar = input.nextDouble();
                    result = firstVar * secondVar;
                    numCalculations = numCalculations + 1;
                    sumResults = sumResults + result;
                    System.out.println("Current Result: " + result);
                    menu();
                    break;


                case 4: // Division
                    System.out.print("Enter first operand: ");
                    firstVar = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondVar = input.nextDouble();
                    result = firstVar / secondVar;
                    numCalculations = numCalculations + 1;
                    sumResults = sumResults + result;
                    System.out.println("Current Result: " + result);
                    menu();
                    break;


                case 5: //exponentiation
                    System.out.print("Enter first operand: ");
                    firstVar = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondVar = input.nextDouble();
                    result = Math.pow(firstVar, secondVar);
                    numCalculations = numCalculations + 1;
                    sumResults = sumResults + result;
                    System.out.println("Current Result: " + result);
                    menu();
                    break;


                case 6: // Logarithm
                    System.out.print("Enter first operand: ");
                    firstVar = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondVar = input.nextDouble();
                    result = Math.log(secondVar) / Math.log(firstVar);
                    numCalculations = numCalculations + 1;
                    sumResults = sumResults + result;
                    System.out.println("Current Result: " + result);
                    menu();
                    break;

                case 7: // Average

                    //if no calculations have been made show error message
                    if (numCalculations == 0) {
                        System.out.println("Error: No calculations yet to average!");
                    }
                    //show the sum, amount, and average of calculations
                    else {
                        System.out.println("Sum of Calculations: " + sumResults);
                        System.out.println("Number of Calculations: " + numCalculations);
                        System.out.println("Average of Calculations: " + sumResults / numCalculations);

                    }

            }
        }
    }
}

