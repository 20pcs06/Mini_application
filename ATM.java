import java.util.Scanner;
class User
{
    String name;
    int pin;
    int balance;

    public User(String name, int pin, int balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

}
public class ATM {
    static Scanner sc;
    static int amount[]={0,0,0,0};
    static int dem[]={100,200,500,2000};
    static User user1=new User("harish", 1234, 5000);
    static User user2=new User("omprakash", 1234, 50000);
    static User user3=new User("kevin", 1234, 40000);

    static void addAmount()
    {
        for(int i=0;i<4;i++)
        {
            System.out.print("Enter the no of "+dem[i]+" :");
            amount[i]+=sc.nextInt();
        }
    }
    static void showAmount()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println(dem[i]+" --> "+amount[i]);
        }
    }
    public static void main(String ar[])
    {
        sc=new Scanner(System.in);
        int ch=0;
        do
        {
            System.out.println("ATM Application");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();  
                    System.out.println("Enter the username and password");
                    String user=sc.next();
                    int pin=sc.nextInt();
                    if(user.equals("admin") && pin==1234)
                    {
                        int ad_ch=0;
                        do
                        {
                            System.out.println("Admin Panel");
                            System.out.println("1. Load");
                            System.out.println("2. Show");
                            System.out.println("3. Exit");
                            System.out.println("Enter the your choice");
                            ad_ch=sc.nextInt();
                            switch(ad_ch)
                            {
                                case 1:
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush(); 
                                    addAmount();
                                break;
                                case 2:
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush(); 
                                    showAmount();
                                break;
                                case 3:
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush(); 
                                    System.out.println("Logout Successfully");
                                break;
                                default:
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush(); 
                                    System.out.println("Invalid Input");
                                break;
                            }
                        }while(ad_ch!=3);
                    }
                    else
                    {
                        System.out.println("Invalid User");
                    }
                break;
                case 2:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Enter the username and Password");
                    String cust=sc.next();
                    int cust_pin=sc.nextInt();
                    if(cust.equals(cust) && cust_pin==1234)
                    {
                        int cust_ch=0;
                        do
                        {
                            System.out.println("Welcome "+cust);
                            System.out.println("1. Withdraw");
                            System.out.println("2. Balance");
                            System.out.println("3. Pin change");
                            System.out.println("4. Transfer");
                            System.out.println("5. Exit");
                            cust_ch=sc.nextInt();
                            switch(cust_ch){
                                case 1:
                                    System.out.println("Enter the amount");
                                    int withdraw=sc.nextInt();

                                break;
                                case 2:
                                break;
                            }
                        }while(cust_ch!=5);
                    }
                    else
                    {

                    }
                break;
                case 3:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush(); 
                    System.out.println("Exit Successfully");
                break;
                default:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();  
                    System.out.println("Invalid Input");
                break;
            }
        }while(ch!=3);
    }
}
