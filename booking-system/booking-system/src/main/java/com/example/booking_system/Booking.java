package com.example.booking_system;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;
    private String emailCliente;
    private LocalDate dataEvento;
    private String nomeEvento;
    private int numeroPrenotati;


//getter

    public Long getId(){
        return id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getEmailCliente() {
        return emailCliente;
    }
    public LocalDate getDataEvento() {
        return dataEvento;
    }
    public String getNomeEvento() {
        return nomeEvento;
    }
    public int getNumeroPrenotati() {
        return numeroPrenotati;
    }

//setter

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public void setNumeroPrenotati(int numeroPrenotati) {
        this.numeroPrenotati = numeroPrenotati;
    }
    @Override
    public String toString() {
        return "Booking [id Prenotazione: " + id + ", a Nome di: " + nomeCliente + ", emailCliente=" + emailCliente + ", dataEvento="
                + dataEvento + ", nomeEvento=" + nomeEvento + ", numeroPrentati=" + numeroPrenotati + "]";
    }
    
}
