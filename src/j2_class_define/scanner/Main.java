package j2_class_define.scanner;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //////////////////// system.in.scanner
    System.out.println("Enter your name:");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String input1 = scanner.nextLine();
    System.out.println("salam "+ input1);

    System.out.println("Enter your job:");
    Scanner scanner1 = new Scanner(System.in);
    String input2 = scanner1.nextLine();
    System.out.println(input2 + " is good job.");
  }
}
