package accounts;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private BigDecimal minimumBalance; 
    private BigDecimal initialBalance; 
    private String costumerId;

    public CheckingAccount (Integer accountNumber, String costumerId, String name, BigDecimal initialBalance, BigDecimal minimumBalance) {
       super(accountNumber, initialBalance, name); 
       this.minimumBalance = minimumBalance;
       this.initialBalance = initialBalance; 
       this.costumerId = costumerId;
    }

    public BigDecimal getMinimumBalance () {
        return this.minimumBalance; 
    }
}
