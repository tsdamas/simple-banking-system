import java.math.BigDecimal;

import accounts.CheckingAccount;

public class Bank {
    public static void main(String[] args) {
        Costumer newCostumer = new Costumer("Angelic Wong", "Third Street, Vernon, British Columbia", "200-300-500", "C0001");

        CheckingAccount checkingAccount = newCostumer.createCheckingAccount(0001, BigDecimal.valueOf(1000.00), BigDecimal.valueOf(100.00));

        newCostumer.printCostumerInfo();
    }
    
}
