package _1_Introduction_to_Java.exercise;


import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {
        System.out.println("xin moi nhap so");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        int hangChuc = (b % 100) / 10;
        int hangTram = b / 100;
        int hangDonVi = b - hangTram * 100 - hangChuc * 10;

        soTram(hangTram);
        soChuc(hangChuc);
        soDonVi(hangDonVi);

        switch (b) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;

            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
//            case 13:
//                System.out.println("thirteen");
////            case 14:
////                System.out.println("fourteen");
////            case 15:
////                System.out.println("fifteen");
////            case 16:
////                System.out.println("sixteen");
////            case 17:
////                System.out.println("seventeen");
////            case 18:
////                System.out.println("eighteen");
////            case 19:
////                System. out.println("nineteen");
//            case 20:
//                System.out.println("twenty");
//            case 30:
//                System.out.println("thirty");
//            case 40:
//                System.out.println("forty");
//            case 50:
//                System.out.println("fifty");
//            case 60:
//                System.out.println("sixty");
//            case 70:
//                System.out.println("seventy");
//            case 80:
//                System.out.println("eighty");
//            case 90:
//                System.out.println("ninety");

        }

    }

    public static void soDonVi(int hangDonVi) {
        switch (hangDonVi) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }

    public static void soChuc(int hangChuc) {
        switch (hangChuc) {
            case 2:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("thirty");
                break;
            case 4:
                System.out.println("forty");
                break;
            case 5:
                System.out.println("fifty");
                break;
            case 6:
                System.out.println("sixty");
                break;
            case 7:
                System.out.println("seventy");
                break;
            case 8:
                System.out.println("eighty");
                break;
            case 9:
                System.out.println("ninety");
                break;
        }
    }

    public static void soTram(int hangTram) {
        switch (hangTram) {
            case 1:
                System.out.println("one hundred");
                break;
            case 2:
                System.out.println("two hundred");
                break;
            case 3:
                System.out.println("three hundred");
                break;
            case 4:
                System.out.println("four hundred");
                break;
            case 5:
                System.out.println("five hundred");
                break;
            case 6:
                System.out.println("six hundred");
                break;
            case 7:
                System.out.println("seven hundred");
                break;
            case 8:
                System.out.println("eight hundred");
                break;
            case 9:
                System.out.println("nine hundred");
                break;
        }
    }
}