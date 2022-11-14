package item2;

import item2.beans.Ticket;
import item2.interfaces.TicketInterface;

public class TicketCalculator implements TicketInterface{
    Ticket ticket;
    
    @Override
    public void classifyTicketType(int age) {
        if(age <= 16) {
            ticket.setTicketType(TicketType.CHILD);
            ticket.setPrice(10);
        }
        else if(age >= 65){
            ticket.setTicketType(TicketType.SENIOR);
            ticket.setPrice(12);
        }
        else {
            ticket.setTicketType(TicketType.ADULT);
            ticket.setPrice(15);
        }
    }

    @Override
    public void processTicket(Ticket ticket, float saleTax) {
        ticket.setSaleTax(saleTax);
        ticket.setSalePrice(ticket.getPrice() + ticket.getSaleTax());
        System.out.println(String.format("Ticket code: %s", ticket.getCode()));
        System.out.println(String.format("Ticket type: %s", ticket.getTicketType()));
        System.out.println(String.format("Ticket code: %s", ticket.getPrice()));
        System.out.println(String.format("Sale tax: %s", ticket.getSaleTax()));
        
    }

}
