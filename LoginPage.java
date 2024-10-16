import java.util.*;
class credentials{
    static int db_cid,db_pwd,db_age;
    static long db_cno;
    static double db_bal;
    static Scanner sc = new Scanner(System.in);
    static boolean did_signup_done;
    public static boolean doesnotExists(){
        return did_signup_done;
    }
    public static void signup()throws Exception{//signup
        if(did_signup_done){
            System.out.println("\t\t\tAccount already exists plz login...");
        }else{
            System.out.print("Enter customer id : ");
            db_cid = sc.nextInt();
            System.out.print("Enter customer Password : ");
            db_pwd = sc.nextInt();
            System.out.print("Enter contact no : ");
            db_cno = sc.nextLong();
            System.out.print("Enter your age : ");
            db_age = sc.nextInt();
            System.out.println("\t\t\tProcessing...");
            Thread.sleep(2000);
            System.out.println("\t\t\tAccount was created Successfully....");
            did_signup_done = true;
            db_bal = 500;
        }
    }//end of signup.
    public static void login()throws Exception{//login
        if (doesnotExists()){
            System.out.print("Enter the customer id : ");
            int cid = sc.nextInt();
            System.out.print("Enter password : ");
            int pwd = sc.nextInt();
            if(cid == db_cid && pwd == db_pwd){
                Thread.sleep(2000);
                System.out.println("\t\t\tProcessing");
                System.out.println("\t\t\tWelcome to Dinesh Bank...");
                Account.Account();
            }else{
                Thread.sleep(2000);
                System.out.println("\t\t\tProcessing");
                System.out.println("Invalid login Credentials...");
            }
    }else{
        Thread.sleep(2000);
        System.out.println("\t\t\tAccount not exists.plz create the account...");
      
    }

    }//end of login
    public static void forgotten()throws Exception{
        if(doesnotExists()){

            System.out.print("Enter the contactno : ");
            long cno = sc.nextLong();
            if(db_cno == cno){
                int sys_otp = (int)(Math.random()*9999+9999);
                Thread.sleep(2000);
                System.out.println("\t\t\tProcessing...");
                System.out.println("OTP = "+sys_otp);
                System.out.print("Enter the OTP : ");
                int e_otp = sc.nextInt();
                if(sys_otp == e_otp){
                    Thread.sleep(2000);
                    System.out.println("\t\t\tProcessing...");
                    System.out.println("Verification Succesfull...");
                    System.out.print("Enter new user id : ");
                    db_cid = sc.nextInt();
                    System.out.print("Enter new pwd : ");
                    db_pwd = sc.nextInt();
                    System.out.println("Account was changed successfully...");
    
                }else{
                    Thread.sleep(2000);
                    System.out.println("\t\t\tProcessing...");
                    System.out.println("\t\t\tVerification failed...");
                }
            }
        }else{
            System.out.println("\t\t\tCreate the account first!");
        }
    }
    public static void main(String[] args)throws Exception{
        boolean flag = true; 
        System.out.println("\t\t\tWelcome to our Application...");
        System.out.println("-------------------------------------------------------------------------------------");
        do{
            System.out.println("\t\t\tSelect the operation.");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("1.Sign up \n2.Login \n3.Forgotten \n4.Exit.");
            int input = sc.nextInt();
            
            switch (input) {
                case 1:{
                    credentials.signup();
                    break;}
                case 2:{
                    credentials.login();
                    break;
                }
                case 3:{
                    credentials.forgotten();
                    break;
                }
                case 4:{
                    flag = false;
                    break;
                }
            }
        }while(flag);
        System.out.println("\t\t\tThanks for using Application...");
    }
}