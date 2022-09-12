import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TContaBancaria contaBancaria = new TContaBancaria();
        int ipt_menu;


        System.out.println("1 - Iniciar conta");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saque");
        System.out.println("4 - Transferir");
        System.out.println("5 - Exibir saldo");
        ipt_menu = keyboard.nextInt();

        switch (ipt_menu){
            case 1:
                contaBancaria.InitAccount("1","0001","Rafael Felipe","11111111111");
                contaBancaria.InitAccount("2","0001","Luiz Carlos","22222222222");
                System.out.println("Contas criadas com sucesso");
                break;
            case 2:
                contaBancaria.Deposit(500);
                break;
            case 3:
                contaBancaria.Withdraw(600);
                break;
            case 4:
                contaBancaria.TransferBalance("1","0001","2","0001",100);
                break;
            case 5:
                System.out.println(contaBancaria.ViewBalance());
                break;
        }



    }
}