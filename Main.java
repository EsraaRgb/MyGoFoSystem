package GoFoSystem;
/**
 * @author Esraa Ragab Ali,  group_S 22 , 20190090
 *@version 1.00 11/6/2021
 */
import java.util.*;
public class Main
{
    static GoFo myGoFo = new GoFo();
    static Scanner input = new Scanner(System.in);
    static int ch;
    static int id;
    static int ip;
    static String password;
    /**
     *  Function displayMenu display choices menu to the user to enter his choice number
     */
    static void displayMenu()
    {
        System.out.println("1-SIGN UP .");
        System.out.println("2-SIGN IN.");
        System.out.println("3-EXIT .");
    }
    /**
     *  Function signUp ask the user to enter his personal information to create his profile
     */
    static void signUp(int ch){
        System.out.println("ENTER YOUR INFORMATION AS FOLLOW: NAME, PHONE, LOCATION, PASSWORD,EMAIL");
        String name = input.next();
        String phone = input.next();
        String location = input.next();
        String password = input.next();
        String email = input.next();
        myGoFo.signup(name, phone, password, location, email, ch);
    }
    /**
     *  Function signUp ask the user to enter his id and password to enter his profile as a player
     */
    static void signInPlayer() {
        System.out.println("===========PLAYER===========");
        System.out.println("ENTER YOUR ID AND PASSWORD");
        id = input.nextInt();
        password = input.next();
            if (myGoFo.players.get(id-1).getPassword().equals(password)){
                System.out.println("1-SEARCH PLAYGROUND");
                System.out.println("2-BOOK PLAYGROUND.");
                System.out.println("3-EXIT.");
                ch = input.nextInt();
                while (ch != 3) {
                    if (ch== 1) {
                        System.out.println("1-SEARCH PLAYGROUND BY NAME.");
                        System.out.println("2-SEARCH PLAYGROUND BY ID.");
                        System.out.println("3-SEARCH PLAYGROUND BY LOCATION.");
                        id=input.nextInt();
                        if (id == 1) {
                            System.out.println("ENTER PLAYGROUND NAME ");
                            String name = input.next();
                            myGoFo.searchByName(name);
                        }
                        if (id == 2) {
                            System.out.println("ENTER PLAYGROUND ID ");
                            int id2= input.nextInt();
                            myGoFo.searchById(id2);
                        }
                        if (id == 3) {
                            System.out.println("ENTER PLAYGROUND LOCATION ");
                            String location = input.next();
                            myGoFo.searchByLocation(location);
                        }
                        break;
                    }
                    if (ch == 2) {
                        System.out.println("ENTER PLAYGROUND ID TO BOOK");
                        id = input.nextInt();
                        System.out.println("ENTER TIME SLOT TO BOOK");
                        ip = input.nextInt();
                        myGoFo.players.get(id-1).Book(myGoFo.playgrounds.get(id-1), ip);
                        myGoFo.playgrounds.get(id-1).getOwner().eWallet.deposit(myGoFo.playgrounds.get(id-1).getPrice());

                        System.out.println("BOOKED SUCCESSFULLY");
                    }
                }
            }
            else {
                System.out.println("ENTER VALID ID AND PASSWORD");
            }
    }
    /**
     *  Function signUp ask the user to enter his id and password to enter his profile as an owner
     */
    static void signInOwner() {
        System.out.println("===========OWNER===========");
        System.out.println("ENTER YOUR ID AND PASSWORD");
        id = input.nextInt();
        password = input.next();
        if (myGoFo.owners.get(id - 1).getPassword().equals(password)) {
            System.out.println("1-REGISTER PLAYGROUND.");
            System.out.println("2-EXIT.");
            ch = input.nextInt();
            while (ch != 2) {
                if (ch == 1) {
                    System.out.println("ENTER YOUR PLAYGROUND INFORMATION AS FOLLOW: NAME, LOCATION, SIZE, price,AVAILABLE HOURS, CANCELATION PERIOD");
                    String name = input.next();
                    String location = input.next();
                    double size = input.nextDouble();
                    float price = input.nextFloat();
                    int availableHoures = input.nextInt();
                    int cancelationPeriod = input.nextInt();
                    myGoFo.owners.get(id - 1).setPlayGround(myGoFo.RegisterPlayground(name,
                            location, size, price, availableHoures, cancelationPeriod, myGoFo.owners.get(id - 1)));
                }
            }
        }
        else {
            System.out.println("ENTER VALID ID AND PASSWORD");
        }
    }
    public static void main(String[] args)
    {
        Player p1=new Player("esraa","phone","location","password1","email");
        Player p2=new Player("heba","phone","location","password2","email");
        Player p3=new Player("saad","phone","location","password3","email");
        Owner o1=new Owner("saad","phone","location","p","email");
        PlayGround pg1=new PlayGround("name","location",200,10,5,2);
        PlayGround pg2=new PlayGround("name2","location2",300,10,4,2);
        PlayGround pg3=new PlayGround("name3","location3",550,15,7,2);
        o1.setPlayGround(pg1);
        myGoFo.players.add(p1);
        myGoFo.players.add(p2);
        myGoFo.players.add(p3);
        myGoFo.owners.add(o1);
        myGoFo.playgrounds.add(pg1);
        myGoFo.playgrounds.add(pg2);
        myGoFo.playgrounds.add(pg3);
        System.out.println("=======WELCOME TO GOFO , PLEASE ENTER CHOICE NUMBER=======");
        displayMenu();
        do {
            ch = input.nextInt();
            //signUp operation
            if (ch == 1) {
                System.out.println("1-PLAYER");
                System.out.println("2-PLAYGROUND OWNER.");
                System.out.println("3-EXIT.");
                ip = input.nextInt();
                while (ip != 3) {
                    if (ip == 1) {
                       signUp(1);
                       break;
                    }
                    if (ip == 2) {
                       signUp(2);
                       break;
                    }
                }
                displayMenu();
            }
            // signIN operation
            if (ch == 2) {
                System.out.println("1-PLAYER");
                System.out.println("2-PLAYGROUND OWNER.");
                ip = input.nextInt();
                //sign in as player
                if (ip == 1) {
                    signInPlayer();
                }
                //sign in as owner
                if (ip == 2) {
                   signInOwner();
                }
                displayMenu();
            }
        }
        while (ch != 3);
    }
}

