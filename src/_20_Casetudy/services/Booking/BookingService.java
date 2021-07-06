package _20_Casetudy.services.Booking;

import _20_Casetudy.models.Booking;
import _20_Casetudy.services.Service;

public interface BookingService extends Service<Booking> {
    @Override
    void showInfo();
    void addBooking();
}
