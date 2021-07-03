package _20_Casetudy.libs;

import _20_Casetudy.models.Booking;

public class Comparator implements java.util.Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getStartDay() > o2.getStartDay()) {
            return 1;
        } else if (o1.getStartDay() < o2.getStartDay()) {
            return -1;
        } else {
            return 0;
        }
    }
}