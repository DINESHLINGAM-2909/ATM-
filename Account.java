import java.util.*;
class Account{
    static Scanner sc = new Scanner(System.in);
    public static void Account() throws Exception{
        boolean flag = true;
        do{
            System.out.println("\t\t\tSelect the operation...");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance \n4.Exit");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    System.out.print("Enter the amount you want to deposit : ");
                    double deposit = sc.nextDouble();
                    credentials.db_bal += deposit;
                    Thread.sleep(2000);
                    System.out.println("\t\t\tAmount added successfully...");
                    Thread.sleep(2000);
                    break;
                }
                case 2:{
                    System.out.print("\t\tEnter your pwd : ");
                    int pwd = sc.nextInt();
                    if(credentials.db_pwd == pwd){
                        if(credentials.db_bal <= 500){
                            System.out.println("\t\t\tYou reached your minimum balance you can't withdraw.");
                        }else{
                            System.out.print("\t\t\tEnter the amount to withdraw : ");
                            double withdraw = sc.nextDouble();
                            if(credentials.db_bal - withdraw <= 500){
                                Thread.sleep(2000);
                                System.out.println("\t\t\tInsufficient balance...");
                            }else{
                                credentials.db_bal -= withdraw;
                                System.out.println("\t\t\tAmount withdrawl successfully...");
                            }
                        }
                }else{
                    System.out.println("\t\t\tPlease enter a valid password...");
                }
                    Thread.sleep(2000);
                    break;
                }
                case 3:{
                    Thread.sleep(2000);
                    System.out.print("Balance is = "+credentials.db_bal);
                    Thread.sleep(2000);
                    break;
                }
                case 4:{
                    flag = false;
                    break;
                }
            }

        }while(flag);
        System.out.println("\t\t\tRedirecting to home page...");
        Thread.sleep(2000);      
    }
}