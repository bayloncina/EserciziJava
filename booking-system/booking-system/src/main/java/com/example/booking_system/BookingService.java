package com.example.booking_system;

import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class BookingService {

    private final BookingRepository repoBooking;

    public BookingService(BookingRepository repoBooking) {
        this.repoBooking = repoBooking;
    }

    public Booking addBooking(Booking booking) {
        return repoBooking.save(booking);
    }
    public Booking getBookingById(Long idBooking){
        return repoBooking.findById(idBooking).orElseThrow(() -> new RuntimeException("Prenotazione non trovata"));
    }
    public List<Booking> getAllBookings(){
        return repoBooking.findAll();
    }
    public Booking upDateBooking(Long id, Booking updatedBooking){
        Booking existingBooking = getBookingById(id);
        existingBooking.setNomeCliente(updatedBooking.getNomeCliente());
        existingBooking.setEmailCliente(updatedBooking.getEmailCliente());
        existingBooking.setDataEvento(updatedBooking.getDataEvento());
        existingBooking.setNomeEvento(updatedBooking.getNomeEvento());
        existingBooking.setNumeroPrenotati(updatedBooking.getNumeroPrenotati());
        return repoBooking.save(existingBooking);
    }
    public void deleteBooking(Long id) {
        repoBooking.deleteById(id);
    }
    
}

    
