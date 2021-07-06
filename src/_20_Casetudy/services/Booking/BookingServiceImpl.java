package _20_Casetudy.services.Booking;

import _20_Casetudy.models.Booking;
import _20_Casetudy.services.Booking.BookingService;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    public static Scanner scanner = new Scanner(System.in);
    public  static TreeSet<Booking> bookings = new TreeSet();
    static {
        bookings.add(new Booking("1",12,"25",18,"swim","vip"));
    }
    @Override
    public void showInfo() {
       for (Booking bookings1 : bookings) {
           if (bookings1!=null) {
               System.out.println(bookings1);
           }
       }
    }
    private  String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }

    @Override
    public void addBooking() {
        String codeBook  = inputOutput("Nhap ma booking ban muon them vao");
        int startDay = Integer.parseInt(inputOutput("Ngay bat dau"));
        String codeCustomer = inputOutput("Them ma khach hang");
        int endDay = Integer.parseInt(inputOutput("Them ngay ket thuc"));
        String service = inputOutput("Them dich vu");
        String serviceLevel = inputOutput("Chat luong dich vu");
    }
}
