package com.guddu.service.interfac;

import com.guddu.dto.Response;
import com.guddu.entity.Booking;

public interface IBookingService {


    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
