/**
 * @author Heba_tullah Adel, group-S 22,  20190609
 */
package GoFoSystem;
import java.util.Scanner;

public class Owner  extends Person{
    private static  int count=0;
    private PlayGround playGround;
    public Owner(){
        super();
        count++;
        setId(count);
    }

    /** class constructor  that specify number of object to creat
     *
     * @param name
     * @param phone
     * @param location
     * @param password
     * @param email
     */
    public Owner(String name, String phone, String location, String password, String email) {
        super(name,phone,location,password,email);
        count++;
        setId(count);
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

    public PlayGround getPlayGround() {
        return playGround;
    }

    public void setPlayGround(PlayGround playGround) {
        this.playGround = playGround;
    }
}