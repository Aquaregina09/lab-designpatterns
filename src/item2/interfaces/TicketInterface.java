package item2.interfaces;

import item2.beans.Ticket;

public interface TicketInterface {
    void classifyTicketType(int age);
    void processTicket(Ticket ticket, float saleTax);;
}
