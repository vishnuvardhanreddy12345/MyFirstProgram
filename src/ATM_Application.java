import java.util.Scanner;

public class ATM_Application {
    private String username;
    private int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public static void main(String[] args) {
        ATM_Application atm=new ATM_Application();
        atm.setUsername("vishnu005");
        int totalAmount=30000;
        atm.setPassword(123321);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter user name and password");
        String user=scan.next();
        int pass=scan.nextInt();
        if (atm.username.equals(user) && atm.password==pass) {
            System.out.println("Access given");
            /*int withdrawAmount=scan.nextInt();
            totalAmount=totalAmount-withdrawAmount;
            System.out.println("After withdraw amount bank  balance is : "+totalAmount);*/
            System.out.println("Enter 1 to withdraw amount, enter 2 to check bank balance, enter 3 to change the username or password");
            int i=scan.nextInt();
            switch (i){
                case 1:
                    int withdrawAmount=scan.nextInt();
                    System.out.println("Amount withdraw successful");
                    System.out.println("Amount withdraw : "+withdrawAmount);
                    totalAmount=totalAmount-withdrawAmount;
                    break;
                case 2:
                    System.out.println("Bank balance : "+totalAmount);
                case 3:
                    System.out.println("Enter 1 to change username, enter 2 to change password");
                    int x=scan.nextInt();
                    switch (x){
                        case 1:
                            System.out.println("enter the new username");
                            atm.setUsername(scan.next());
                            break;
                        case 2:
                            System.out.println("set new password");
                            atm.setPassword(scan.nextInt());
                            break;
                        default:
                            System.out.println("Enter valid information");
                    }
                    break;
                default:
                    System.out.println("Please enter the correct value");
            }
        }else {
            System.out.println("Access Denied");
        }
        System.out.println(atm.username);
    }
}
