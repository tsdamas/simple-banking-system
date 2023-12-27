package accounts;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private BigDecimal minimumBalance; 

    public CheckingAccount () {
       this.minimumBalance = new BigDecimal(100.00); 
    }

    public BigDecimal getMinimumBalance () {
        return this.minimumBalance; 
    }
}
