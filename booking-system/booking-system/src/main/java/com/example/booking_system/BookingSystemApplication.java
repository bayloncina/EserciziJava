package com.example.booking_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemApplication.class, args);
	// 	Scanner scanner = new Scanner(System.in);
    //     List<Booking> bookings = new ArrayList<>(); // Simula un repository temporaneo
    //     boolean running = true;

    //     while (running) {
    //         System.out.println("\nSistema di Gestione Prenotazioni");
    //         System.out.println("1. Inserire una prenotazione");
    //         System.out.println("2. Visualizzare tutte le prenotazioni");
    //         System.out.println("3. Uscire");
    //         System.out.print("Scegli un'opzione: ");
    //         int choice = scanner.nextInt();
    //         scanner.nextLine(); // Consuma il newline

    //         switch (choice) {
    //             case 1 -> {
    //                 // Inserire una nuova prenotazione
    //                 Booking newBooking = new Booking();

    //                 System.out.print("Inserisci il nome del cliente: ");
    //                 newBooking.setNomeCliente(scanner.nextLine());

    //                 System.out.print("Inserisci l'email del cliente: ");
    //                 newBooking.setEmailCliente(scanner.nextLine());

    //                 System.out.print("Inserisci la data dell'evento (formato YYYY-MM-DD): ");
    //                 newBooking.setDataEvento(LocalDate.parse(scanner.nextLine()));

    //                 System.out.print("Inserisci il nome dell'evento: ");
    //                 newBooking.setNomeEvento(scanner.nextLine());

    //                 System.out.print("Inserisci il numero di posti prenotati: ");
    //                 newBooking.setNumeroPrenotati(scanner.nextInt());
    //                 scanner.nextLine(); // Consuma il newline
    //                 bookings.add(newBooking);

    //                 System.out.println("Prenotazione aggiunta con successo!");
    //             }
    //             case 2 -> {
    //                 // Visualizzare tutte le prenotazioni
    //                 if (bookings.isEmpty()) {
    //                     System.out.println("Nessuna prenotazione disponibile.");
    //                 } else {
    //                     System.out.println("\nElenco delle Prenotazioni:");
    //                     for (Booking booking : bookings) {
    //                         System.out.println(booking);
    //                     }
    //                 }
    //             }
    //             case 3 -> {
    //                 // Uscire dal programma
    //                 running = false;
    //                 System.out.println("Uscita dal sistema. Arrivederci!");
    //             }
    //             default -> System.out.println("Opzione non valida. Riprova.");
    //         }
    //     }
    //     scanner.close();
	}

}
