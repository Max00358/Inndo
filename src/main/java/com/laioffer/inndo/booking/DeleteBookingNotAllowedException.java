package com.laioffer.inndo.booking;

public class DeleteBookingNotAllowedException extends RuntimeException {
    public DeleteBookingNotAllowedException(long guestId, long bookingId) {
        super("Guest " + guestId + " not allow to delete the booking " + bookingId);
    }
}
