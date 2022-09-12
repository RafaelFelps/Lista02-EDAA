public class TContaBancaria {
    private String AccountNumber;
    private String Agency;
    private String Name;
    private String Cpf;
    private double Balance;

    public void InitAccount(String accNumber, String agency, String name, String cpf){
        this.AccountNumber = accNumber;
        this.Agency = agency;
        this.Cpf = cpf;
        this.Name = name;
        this.Balance = 0;
    }

    public String GetAccountNumber(){
        return this.AccountNumber;
    }

    public String GetAgencyNumber(){
        return this.Agency;
    }

    public void Deposit(double value){
        this.Balance += value;
    }

    public void Withdraw(double value){
        if(value > Balance){
            return;
        }
        this.Balance -= value;
    }

    public double ViewBalance(){
        return this.Balance;
    }

    public void TransferBalance(String sourceAccount, String sourceAgency, String destinationAccount, String destinationAgency, double value){
        TGerenciamento.Transfer(sourceAccount,sourceAgency,destinationAccount, destinationAgency, value);
    }
}
