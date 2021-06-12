package GoFoSystem;

public class EWallet {

    private static int count = 0;
    private int id;
    private String password;
    private double balance;
    private Person owner;
    /** default constructor sets the balance to zero and give id number to the eWallet*/
    public EWallet() {
        setBalance(500);
        count++;
        id = count;
    }
    /** class constructor  that specify number of object to creat with one parameter
     @param password (string value)
     */
    public  EWallet(String password ){
        setPassword(password);
        setBalance(500);
    }
    /**the setOwner method assign a given value for object from person
     *@param owner object from class person is the value to enter anew owner*/
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    /**the setId method  it have a counter which increase ove every object created it han no parameter because it set as default by system*/
    public void setId() {
        this.id = count;
    }
    /**the setBalance method assign a given value to the balance of player
     *@param balance  is the value to set player balance nationalID*/
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**the setPassword method assign a given value to the password of player and owner
     *@param password  is the value to set player and owner balance password*/
    public void setPassword(String password) {
        this.password = password;
    }
    /**the getId method return the value of of the person Id
     *@return return the value of the person id
     */
    public int getId() {
        return id;
    }
    /**the getPassword method return the value of of the person password
     *@return return the value of the person password
     */

    public String getPassword() {
        return password;
    }
    /**the getBalance method return the vaiue of of the person balance
     *@return return the value of the person balance
     */

    public double getBalance() {
        return balance;
    }
    /**the getOwner method return the vaiue of of the object of class owner
     *@return return the value of the person id
     */

    public Person getOwner() {
        return owner;
    }
     /**function  deposit which explain the money that added
   @param moneyAdd which add on the balance
    @return return the money which added and the new value of the balance
    */

    public void deposit(double moneyAdd) {
        balance += moneyAdd;
    }
    /** function withdraw method that check if the parameter is suitable to withdraw or not
         @param moneyNeed the value which depend on balance
         @return return the money which you take and represent the balance after takeing money
        */
    public void withdraw(double moneyNeed) {
        if (balance > 0 && moneyNeed <= balance) {

            balance = balance - moneyNeed;
            System.out.println("YOU PAY " + moneyNeed + "YOUR BALANCE NOW IS : " + getBalance());
        } else {
            System.out.println("NOT VALID OPERATION, YOUR BALANCE IS : " + getBalance());

        }
    }
    /**
     * the toString method return the value of the player balance
     *@return return the all value of player balance
     */
    @Override
    public String toString() {
        return String.format("YOUR BALANCE KNOW IS" + getBalance());
    }
}

