/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

 private static Scanner in = new Scanner(System.in);

 public static void main(String[] args) {
  ProblemSet3 ps = new ProblemSet3();

  // comment out or uncomment as needed

  ps.sign(); // executes Exercise 1
  ps.parity(); // executes Exercise 2
  ps.ordered(); // executes Exercise 3
  ps.gpa(); // executes Exercise 4
  ps.grade(); // executes Exercise 5
  ps.cards(); // executes Exercise 6
  ps.leapYear(); // executes Exercise 7
  ps.state(); // executes Exercise 8
  ps.months(); // executes Exercise 9
  ps.salary(); // executes Exercise 10

  in .close();
 }

 /*
  * Exercise 1.
  *
  * Prompt the user to enter an integer. Is it positive, negative, or zero?
  */

 public void sign() {

  System.out.print("\n");

  System.out.print("Enter an integer: ");
  int number = in .nextInt();

  System.out.print("\n");

  if (number > 0) {

   System.out.println("Positive.");

  } else if (number < 0) {

   System.out.println("Negative.");

  } else {

   System.out.println("Zero.");

  }

 }

 /*
  * Exercise 2.
  *
  * Prompt the user to enter an integer. Is it even or odd?
  */

 public void parity() {

  System.out.print("\n");

  System.out.print("Enter an integer: ");
  int number = in .nextInt();

  System.out.print("\n");

  if (Math.abs(number % 2) == 1) {

   System.out.print("Odd.");

  } else if (number % 2 == 0) {

   System.out.print("Even.");

  }

  System.out.print("\n");
 }

 /*
  * Exercise 3.
  *
  * Prompt the user to enter three integers. How are the integers ordered?
  */

 public void ordered() {

  System.out.print("\n");

  System.out.println("Enter three integers.");
  System.out.print("\n");

  System.out.print("Enter integer: ");
  int firstInteger = in .nextInt();

  System.out.print("Enter integer: ");
  int secondInteger = in .nextInt();

  System.out.print("Enter integer: ");
  int thirdInteger = in .nextInt();

  String order;

  if (firstInteger > secondInteger && secondInteger > thirdInteger) {

   order = "Strictly Decreasing.";

  } else if (firstInteger < secondInteger && secondInteger < thirdInteger) {

   order = "Stricly Increasing.";

  } else if ((firstInteger > secondInteger && secondInteger >= thirdInteger) ||
   (firstInteger >= secondInteger && secondInteger > thirdInteger)) {

   order = "Decreasing.";

  } else if ((firstInteger < secondInteger && secondInteger <= thirdInteger) ||
   (firstInteger <= secondInteger && secondInteger < thirdInteger)) {

   order = "Increasing.";

  } else {

   order = "Unordered.";

  }

  System.out.print("\n");
  System.out.print(order);
  System.out.print("\n");
 }

 /*
  * Exercise 4.
  *
  * Prompt the user to enter a letter grade. What's the corresponding GPA?
  */

 public void gpa() {

  double A_GRADE = 4.00;
  double B_GRADE = 3.00;
  double C_GRADE = 2.00;
  double D_GRADE = 1.00;
  double F_GRADE = 0.00;

  System.out.print("\n");
  System.out.print("Enter a letter grade: ");
  String letterGrade = in .next();
  in.nextLine();
  System.out.print("\n");

  String letter = letterGrade.substring(0,1);
  double gpa = 0;
  boolean validGrade = true;
  double GPA_DECIMAL = 0.33;

  if (letter.equals("A")) {

    gpa = A_GRADE;

  } else if (letter.equals("B")) {

    gpa = B_GRADE;

  } else if (letter.equals("C")) {

    gpa = C_GRADE;

  } else if (letter.equals("D")) {

    gpa = D_GRADE;

  } else if (letter.equals("F")) {

    gpa = F_GRADE;

  } else {

    validGrade = false;

  }

  if (letterGrade.substring(1).equals("+") && !(letter.equals("F")) &&
   !(letterGrade.equals("A+"))) {

    gpa += GPA_DECIMAL;

  } else if (letterGrade.substring(1).equals("-") && !(letter.equals("F"))) {

    gpa -= GPA_DECIMAL;

  } else {

    gpa = gpa;

  }

  if ( !(letterGrade.equals(letter + "+") || letterGrade.equals(letter + "-") ||
   letterGrade.equals(letter)) || (letterGrade.equals("F+") ||
   letterGrade.equals("F-"))) {

    validGrade = false;

  }

  if (validGrade) {

    System.out.print("Your GPA is: ");
    System.out.printf("%.2f", gpa);
    System.out.print(".");

  } else {

    System.out.print("That's not a valid letter grade.");

  }

  System.out.print("\n");

 }

 /*
  * Exercise 5.
  *
  * Prompt the user to enter a grade. What's the corresponding letter grade?
  */

 public void grade() {

    boolean validGrade = true;
    String letterGrade = "";
    int A_THRESHOLD = 90;
    int B_THRESHOLD = 80;
    int C_THRESHOLD = 70;
    int D_THRESHOLD = 60;
    int F_THRESHOLD = 0;
    String article = "a";


    System.out.print("\n");
    System.out.print("Enter a grade: ");
    Double numberGrade = in .nextDouble();
    System.out.print("\n");

    if (100.0 < numberGrade || numberGrade < 0) {

      validGrade = false;

    } else if (A_THRESHOLD <= numberGrade) {

      letterGrade = "A";
      article += "n";

    } else if (B_THRESHOLD <= numberGrade) {

      letterGrade = "B";

    } else if (C_THRESHOLD <= numberGrade) {

      letterGrade = "C";

    } else if (D_THRESHOLD <= numberGrade) {

      letterGrade = "D";

    } else if (F_THRESHOLD <= numberGrade) {

      letterGrade = "F";
      article += "n";

    }

    if (validGrade) {

      System.out.print("You received "+article+" "+letterGrade+".");

    } else if (numberGrade < 0) {

        System.out.print("Grades below 0 are invalid.");

    } else {

      System.out.print("Grades above 100 are invalid.");

    }

    System.out.print("\n");

 }

 /*
  * Exercise 6.
  *
  * Prompt the user to enter a playing card. What card was entered?
  */

 public void cards() {

    System.out.print("\n");
    System.out.print("Enter a card: ");
    String shortRankSuit = in .next();

    boolean validRank = true;
    boolean validSuit = true;
    String rank = "";
    String suit = "";
    String shortRank = shortRankSuit.substring(0,1).toUpperCase();
    String shortSuit = shortRankSuit.substring(1).toUpperCase();

    switch (shortRank){
      case "A":
        rank = "Ace";
        break;
      case "2":
        rank = "Two";
        break;
      case "3":
        rank = "Three";
        break;
      case "4":
        rank = "Four";
        break;
      case "5":
        rank = "Five";
        break;
      case "6":
        rank = "Six";
        break;
      case "7":
        rank = "Seven";
        break;
      case "8":
        rank = "Eight";
        break;
      case "9":
        rank = "Nine";
        break;
      case "J":
        rank = "Jack";
        break;
      case "Q":
        rank = "Queen";
        break;
      case "K":
        rank = "King";
        break;
      default:
        validRank = false;
        break;
    }

    switch (shortSuit){
      case "C":
        suit = "Clubs";
        break;
      case "D":
        suit = "Diamonds";
        break;
      case "H":
        suit = "Hearts";
        break;
      case "S":
        suit = "Spades";
        break;
      default:
        validSuit = false;
        break;
    }

    System.out.print("\n");

    if (validSuit && validRank) {
      System.out.print(rank+" of "+suit+".");
    } else if (!(validRank)) {
      System.out.print("That's not a valid rank.");
    } else {
      System.out.print("That's not a valid suit.");
    }

    System.out.print("\n");

 }

 /*
  * Exercise 7.
  *
  * Prompt the user to enter a year. Is it a leap year or not?
  */

 public void leapYear() {

    System.out.print("\n");
    System.out.print("Enter a year: ");
    int year = in .nextInt();

    boolean leapYear = year%4 == 0 && (year%100 != 0 || year%400 == 0);

    System.out.print("\n");

    if (leapYear) {
      System.out.print(year+" is a leap year.");
    } else {
      System.out.print(year+" is not a leap year.");
    }

    System.out.print("\n");

 }

 /*
  * Exercise 8.
  *
  * Prompt the user to enter a temperature. At that temperature, is water a solid,
  * liquid, or gas?
  */

 public void state() {

 }

 /*
  * Exercise 9.
  *
  * Prompt the user to enter a month. How many days are in that month?
  */

 public void months() {

 }

 /*
  * Exercise 10.
  *
  * Prompt the user to enter a wage and hours worked. How much money will be made?
  */

 public void salary() {

 }
}
