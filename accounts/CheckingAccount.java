package accounts;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private BigDecimal minimumBalance; 
    private BigDecimal initialBalance; 
    private String costumerId; 

    public CheckingAccount (String costumerId, BigDecimal initialBalance, BigDecimal minimumBalance) {
       this.minimumBalance = minimumBalance;
       this.initialBalance = initialBalance; 
       this.costumerId = costumerId; 
    }

    public BigDecimal getMinimumBalance () {
        return this.minimumBalance; 
    }
}
