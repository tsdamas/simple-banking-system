package accounts;

import java.math.BigDecimal;

public class TFSAAccount extends Account{

    final static BigDecimal INTEREST_RATE = new BigDecimal(0.5); 

    public TFSAAccount () {

    } 

    public void addInterest() {
        BigDecimal interest = this.getBalance().multiply(INTEREST_RATE); 
        this.setBalance(this.getBalance().add(interest));
        System.out.println("Interest added: $ " + interest); 
    }
    
}
