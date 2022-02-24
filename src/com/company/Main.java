package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        {
            System.out.println("Type start to run the app");
            boolean start = false;

            Scanner pressTheButton = new Scanner(System.in);
            String startButton = pressTheButton.nextLine();

            Scanner nums = new Scanner(System.in);

            Scanner operationChars = new Scanner(System.in);

            double res = 0;
            if (startButton.equals("start") || startButton.equals("Start")) {
                start = true;
                if (start) {
                    Calculator calculator = new Calculator();
                    System.out.println("Enter first number 1 to 1 000 000");
                    if (nums.hasNextDouble()) {
                        calculator.setFirst(nums.nextDouble());
                        if (calculator.getFirst() instanceof Double) {
                            if (calculator.getFirst() > -2147483648 && calculator.getFirst() < 2147483647) {
                                System.out.println("Enter operation char (+,-,/,*)");
                                if (operationChars.next() instanceof String) {
                                    String operation = operationChars.next();
                                    if (operation != null) {
                                        System.out.println("Enter second number 1 to 1 000 000");
                                        if (nums.hasNextDouble()) {
                                            calculator.setSecond(nums.nextDouble());
                                            if (calculator.getSecond() instanceof Double) {
                                                switch (operation) {
                                                    case "/":
                                                        res = calculator.getFirst() / calculator.getSecond();
                                                        break;
                                                    case "*":
                                                        res = calculator.getFirst() * calculator.getSecond();
                                                        break;
                                                    case "+":
                                                        res = calculator.getFirst() + calculator.getSecond();
                                                        break;
                                                    case "-":
                                                        res = calculator.getFirst() - calculator.getSecond();
                                                        break;
                                                    default:
                                                        System.out.println("Something went wrong! Try again later.\n");
                                                }
                                                System.out.println(res);
                                            }
                                        } else System.out.println("You can use only following chars (+,-,/,*)");
                                    } else
                                        System.out.println("you've dialed incorrect datatype. Try toi use next operands((+,-,/,*))  ");
                                } else
                                    System.out.println("you've dialed incorrect datatype. Try toi use next operands((+,-,/,*))  ");
                            } else System.out.println("Something went wrong after the first number dial");
                        }
                    }
                } else {
                    System.out.println("The app is off");
                }
            }
        }
    }
}
