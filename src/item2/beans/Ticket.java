package item2.beans;

import item2.TicketType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

public class Ticket {
    private String code;
    private float price;
    private float saleTax;
    private int customerAge;
    private float salePrice;
    TicketType ticketType;
    
    
    public Ticket(String code, float saleTax, int customerAge) {
        this.code = code;
        this.saleTax = saleTax;
        this.customerAge = customerAge;
    }
    
    
    

    
    
    
}
