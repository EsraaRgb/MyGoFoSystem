package GoFoSystem;

public class Person {
    private String name;
    private String phone;
    private String location;
    private String password;
    private String email;
    private static  int id=0;
    public EWallet eWallet ;
    private Booking bookings;

    /** class constructor  that specify default values to each class attribute to empty String
     *and set a unique id number to each user
     */

    public Person(){
        name ="";
        phone="";
        location="";
        password="";
        email="";
        id++;
    }

    /** class constructor  that specify number of object to create
     * @param name
     * @param phone
     * @param location
     * @param password
     * @param email
     */
    public Person(String name, String phone, String location, String password,String email ) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.password = password;
        this.email=email;
        eWallet=new EWallet(password);
        id++;
    }
    /**the setName method assign agiven value to the name of person
     *@param name is the value to set person name*/
    public void setName(String name)
    {
        this.name = name;
    }
    /**the setPhone method assign agiven value to the phone of person
     *@param phone is the value to set person */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    /**the setLocation method assign agiven value to the location of person
     *@param location is the value to set person */
    public void setLocation(String location)
    {
        this.location = location;
    }
    /**the setPassword method assign agiven value to the password of person
     *@param password is the value to set person */
    public void setPassword(String password)
    {
        this.password=password;
    }
    /**the setId method assign agiven value to the Id of person
     *@param id is the value to set person */
    public void setId(int id)
    {
        this.id=id;
    }
    //Editied
    /**the setEwallet method assign ag iven value to thebalance of person
     *@param balance is the value to set person */
    public void setEWallet(double balance)
    {
        eWallet.setBalance(balance);
    }
    /**the getName method return the value of of the person name
     *@return name return the value of the person name
     */
    //public void setBookings(Player player, PlayGround playground, Owner owner, TimeSlot timeslot)
    public String getName()
    {
        return name;
    }
    /**the getLocation method return the value of of the person locatin
     *@return location return the value of the person location
     */
    public String getLocation()
    {
        return location;
    }
    /**the getPhone method return the value of of the person phone
     *@return return the value of  person phone
     */
    public String  getPhone()
    {
        return phone;
    }
    /**the getPassword method return the value of of the person password
     *@return return the value of  person password
     */
    public String getPassword()
    {
        return password;
    }
    /**the getId method return the value of of the person ID
     *@return return the value of the person Id
     */
    public  int getId()
    {
        return id;
    }
    /**the getEwallet method assign agiven value to thebalance of person
     *@return return value of function to string which include in class Ewallet */
    public String getEWallet()
    {
        return eWallet.toString();
    }
    /**the getEmail method return the value of of the person Email
     *@return return the value of the person Email
     */
    public String getEmail() {
        return email;
    }
    /**the setEmail method assign agiven value to the email of person
     *@param email is the value to set person Email*/
    public void setEmail(String email) {
        this.email = email;
    }
    /**the getBooking method return the value object of class booking
     *@return return the value of the person booking
     */
    public Booking getBookings(){
        return bookings;
    }
    /** the toString method return the value of the person id
     *@return return the  value of person id
     */
    @Override
    public String toString() {
        return String.format("YOUR ID= "+id);
    }
}

