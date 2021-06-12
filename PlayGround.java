package GoFoSystem;
/**
 * @authour saad ahmed saad, group_S 22,  20190237
*/
import java.util.ArrayList;
public class PlayGround {
    private  String name;
    private String location;
    private double size;
    private  static int id;
    private  int availableHours;
    private  double price;
    private  int cancelationPeriod;
    private  boolean status;
    private  Owner Owner;
    public ArrayList<TimeSlot> slots = new ArrayList<TimeSlot>();
    public ArrayList<Booking> Bookings = new ArrayList<Booking>();
    public ArrayList<String> Complaints = new ArrayList<String>();

    /** class constructor  that specify default values to each class attribute
     *
     */
    public PlayGround(){
        name ="";
        location="";
        size =0;
        price=0;
        id++;
    }

    /** class constructor  that specify values to each class attribute
     *
     * @param name
     * @param location
     * @param size
     * @param availableHours
     * @param cancelationPeriod
     */
    public PlayGround(String name,String location,double size,float price,int availableHours,int cancelationPeriod){
        this.name = name;
        this.location = location;
        this.size=size;
        this.price=price;
        this.availableHours=availableHours;
        this.cancelationPeriod=cancelationPeriod;
        id++;

    }
    /**the setName method assign a given value to the name of playground
     *@param name is the value to set playground name*/
    public void setName(String name) {
        this.name=name;
    }
    /**the setLocation method assign a given value to the location of playground
     *@param Location is the value to set playground */
    public void setlocation(String Location) {
        this.location=Location;
    }
    /**the setStatus method assign a given value to the status of playground
     *@param status is the value to set playground */
    public void setStatus(boolean status) {
        this.status=status;
    }
    /**the setSize method assign a given value to the size of playground
     *@param size is the value to set playground */
    public void setSize(double size) {
        this.size=size;
    }
    /**the setSize method assign a given value to the size of playground
     *@param id is the value to set playground */
    public void setID(int id) {
        this.id=id;
    }
    /**the setOwner method assign a given value to the owner of playground
     *@param owner which is an object of class owner  is the value to set playground */
    public void setOwner(Owner owner) {
        this.Owner=owner;
    }
    /**the setCancelationPeriod method assign a given value to the CancelationPeriod of playground
     *@param cancelationPeriod is the value to set playground */
    public void setCancelationPeriod(int cancelationPeriod )
    {
        this.cancelationPeriod=cancelationPeriod;
    }
    /**the getName method return the value of of the playground name
     *@return return the value of the playground name
     */
    public String getName()
    {
        return name;
    }
    /**the getsize method return the value of of the playground size
     *@return return the value of the playground size
     */
    public double getSize()
    {
        return size;
    }
    /**the getLocation method return the value of of the playground location
     *@return return the value of the playground location
     */
    public String getLocation()
    {
        return location;
    }
    /**the getID method return the value of of the playground id
     *@return return the value of the playground id
     */
    public int getID()
    {
        return id;
    }
    /**the getStaus method return the value of of the playground status
     *@return return the value of the playground status
     */
    public Boolean getStatus()
    {
        return status;
    }
    /**the getPrice method return the value of of the playground price
     *@return return the value of the playground price
     */
    public double getPrice() {
        return price;
    }

    /**the setPrice method assign a given value to the price of playground
     *@param price  is the value to set playground */
    public void setPrice(double price) {
        this.price = price;
    }

    public GoFoSystem.Owner getOwner() {
        return Owner;
    }
    /** the to String method return the information of playground
     *@return return the  value of playground information
     */
    @Override
    public String toString() {
        return String.format("PLAYGROUND NAME IS "+name+ "\n"+"PLAYGROUND ID IS "+id+"\n"+"PLAYGROUND LOCATION IS "
                +location+ "\n"+"PLAYGROUND price per hour IS "+price );
    }


}

