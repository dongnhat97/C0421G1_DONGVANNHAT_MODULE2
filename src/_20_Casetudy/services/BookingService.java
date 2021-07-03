package _20_Casetudy.services;

import _20_Casetudy.models.Booking;

public interface BookingService extends Service <Booking>{
    @Override
    void showInfo();
    void addBooking();
}
