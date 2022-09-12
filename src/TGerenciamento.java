public class TGerenciamento {
    private static TContaBancaria[] accounts = new TContaBancaria[0];

    public static TContaBancaria GetAccount(String accountNumber, String agencyNumber) {
        for (TContaBancaria account : accounts) {
            if (account.GetAccountNumber().equals(accountNumber) && account.GetAgencyNumber().equals(agencyNumber))
                return account;
        }
        return null;
    }

    public static boolean Transfer(String sourceAccountNumber, String sourceAgencyNumber, String destinationAccountNumber, String destinationAgencyNumber, double value) {
        if (value < 0)
            return false;

        TContaBancaria newSourceAccount = GetAccount(sourceAccountNumber, sourceAgencyNumber);
        TContaBancaria newDestinationAccount = GetAccount(destinationAccountNumber, destinationAgencyNumber);

        // Verify if account have balance to transfer
        if (newSourceAccount != null && newSourceAccount.ViewBalance() < value) {
            return false;
        }
        // Verify if destination account exists
        if (newDestinationAccount == null){
            return false;
        }

        assert newSourceAccount != null;
        newSourceAccount.Withdraw(value);
        newDestinationAccount.Deposit(value);
        return true;
    }
}
