import java.util.Scanner;
public class MiniProject_ATM_Week_1_solo_project{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float balance = 0;
        float depositMoney=0;
        float withdrawMoney=0;
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+ name +"!");
        int option = 0;
        boolean exit = true;
        while( exit == true ){
            System.out.println("Please Select any one of the following options ");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1-> {
                    System.out.println("Here is your balance:  " + balance);
                    System.out.println();
                }
                case 2->{
                    System.out.println("Enter your deposit money: ");
                    depositMoney = scanner.nextFloat();
                    balance = balance + depositMoney;
                    System.out.print("here is your total balance: " + balance);

                    System.out.println();
                }
                case 3-> {
                    System.out.println("Enter your withdraw money: ");

                    withdrawMoney = scanner.nextFloat();
                    if(withdrawMoney > balance) {
                        System.out.println("You does not have enough money");
                    }
                        balance = balance - withdrawMoney;
                        System.out.println("you have withdrawed " +  withdrawMoney + "Rupees");

                }


                case 4->{
                    exit = false;
                }
                default ->  System.out.println("Invalid option");
            }




        }


    }
}