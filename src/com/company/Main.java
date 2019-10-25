package com.company;

public class Main {

    public static void main(String[] args) {
        //asterisks(10);
        //reverse(1234);
        //positivePrint(5);
        //negativePrint(5);
        //System.out.println(factorial(4));
        //System.out.println(fibonacci(7));
        //System.out.println(palindrome("abcdcba"));
        //System.out.println(GCD(12, 32));
        //System.out.println((sin(1, 0)));
        //System.out.println((cos(1, 0)));
    }

    public static void asterisks(int n) {
        if(n >= 1) {
            asterisks(n-1); //recursive segment- create new instance of asterisks() with value of n-1. The program will not pass
            //pass this point in any instance until n == 0
            System.out.print("*");
        }
    }

    public static void reverse(int n) {
        if (n < 10) {
            System.out.print(n); //if n is a one-digit number, print out n (as the new last digit)
        }
        else {
            System.out.print(n % 10); //otherwise- print the current last digit as the first; then
            //create new instance of reverse() with n/10
            reverse(n/10);
        }
    }

    public static void positivePrint(int n) {
        if(n == 1) {
            System.out.print(n);
        }else {
            positivePrint(n-1);//create new instance with n-1, then start to print characters after n == 1
            System.out.print(n);
        }
    }

    public static void negativePrint(int n) {
        if(n == 1) {
            System.out.print(n);
        }else {
            System.out.print(n);
            negativePrint(n-1); //print the character first, then create new instance with n-1
        }
    }

    public static int factorial(int n) {
        if(n <= 0) {
            return 1;
        }else {
            return (n*factorial(n-1));
        }
    }

    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1)) //if n = the first or second val, return that val
            return n;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2); //otherwise, nth num = (nth - 1) + (nth - 2)
        }

    }

    public static boolean palindrome(String str) {
        if(str.length() == 0 || str.length() == 1) { //if the string is 0 or 1 characters long,
            //it is a palindrome
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)) { //if the two mirror index characters are equal,
            //create new instance with the next set of chars
            return(palindrome(str.substring(1, str.length()-1)));
        }
        return false;
    }

    public static int GCD(int a, int b) {
        int temp;
        if(b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        if(a % b == 0) { //if remainder is 0, the second value is the GCD
            return b;
        }else {
            return GCD(b, a%b); //otherwise create new instance with the next set of numbers
        }
    }

    public static double sin(int n, double x) {
        if(n == 1) {
            return Math.sin(x); //if the value of n is 1, return the value of the sine of x
        }
        return sin(1, x)*cos(n-1, x) + cos(1, x)*sin(n-1, x); //otherwise, create new instance with n-1
    }

    public static double cos(int n, double x) {
        if(n == 1) {
            return Math.cos(x); //if the value of n is 1, return the value of the cosine of x
        }
        return cos(1, x)*cos(n-1, x) + sin(1, x)*sin(n-1, x); //otherwise, create new instance with n-1
    }

}
