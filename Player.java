package GoFoSystem;

import java.util.Scanner;

/**
 * @author Heba_tullah Adel, group-S 22,  20190609
 */
public class Player extends Person {
    public Booking booking;
    public Player(){
        super();
    }

    /** class constructor  that specify number of object to create
     * @param name
     * @param phone
     * @param location
     * @param password
     * @param email
     */
    public Player(String name, String phone, String location, String password, String email) {
        super(name,phone,location,password,email);
    }
    /** function book the user used it to enter the playground which he want and the time neede
    @ param object playground of class playground and integer value of time slot
     */
    public void Book (PlayGround playground,int timeslot){
        eWallet.withdraw(playground.getPrice());
        playground.setStatus(false);
    }
    /** function checkMoney it used to chek if user have a needde money too withdraw or not
     @param id which is a unique value for each user
     @param  password
     */
    public void checkMoney(int id , String password){
        System.out.println("Enter your id and Password");
        Scanner input=new Scanner(System.in);
        id = input.nextInt();
        password= input.next();
        if (id == eWallet.getId() && password==eWallet.getPassword()) {
            System.out.println("Your balance is:" + eWallet.getBalance());
        }
    }
}
