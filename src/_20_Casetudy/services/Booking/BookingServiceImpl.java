package _20_Casetudy.services.Booking;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.libs.Comparator;
import _20_Casetudy.models.Booking;
import _20_Casetudy.models.Contract;
import _20_Casetudy.utils.ReadAndWriteByteStream;
import java.io.File;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static Collection<Booking> bookingSet = new TreeSet<>(new Comparator());
    private static Collection<Booking> bookingContractSet = new TreeSet<>(new Comparator());
    private static Collection<Contract> contractList = new ArrayList<>();

    private static ReadAndWriteByteStream<Booking> bookingFileReadWrite = new ReadAndWriteByteStream<>();
    private static ReadAndWriteByteStream<Booking> needContractReadWrite = new ReadAndWriteByteStream<>();
    private static ReadAndWriteByteStream<Contract> contractReadWrite = new ReadAndWriteByteStream<>();
    private static File fileBooking = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\Booking.csv");
    private static File fileNeedContact = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\NeedContract.csv");
    private static File fileContract = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\Contract.csv");

    static {
        bookingSet = bookingFileReadWrite.readFileByteStream(fileBooking);
        bookingContractSet = needContractReadWrite.readFileByteStream(fileNeedContact);
        contractList = contractReadWrite.readFileByteStream(fileContract);
    }

    @Override
    public void showInfo() {
        if (bookingContractSet.isEmpty()) {
            System.err.println("Not have new booking");
        }
        for (Booking element : bookingContractSet) {
            System.out.println(element);
        }
    }

    public static String checkDuplicatedId() { //check ID trùng
        String bookingId = null;
        boolean check = false;
        while (!check) {
            int count = 0;
            bookingId = Choice.outputStringRegex("Enter booking ID: ");
            for (Booking booking : bookingSet) {
                if (!bookingId.equals(booking.getBookingID())) {
                    count++;
                }
            }
            if (count == bookingSet.size()) {
                System.out.println("ok");
                check = true;
            } else {
                System.out.println("Booking ID cannot be duplicated! Please enter again: ");
            }
        }
        return bookingId;
    }

    private String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }

    @Override
    public void addBooking() {
        System.out.println("1. book house vs id book la BH-01");
        System.out.println("2. book Room vs id book la BR-01");
        System.out.println("3. book Villa vs id book la BV-01");
        System.out.println("nhap lua chon cua ban");
        int choice = Choice.choiceMenu();
        switch (choice) {
            case 1:
                String newID = checkDuplicatedId();

                break;
            case 2:


        }
    }
}