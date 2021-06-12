/**
 * @authour saad ahmed saad, group_S 22,  20190237
 */
package GoFoSystem;
import java.util.ArrayList;

public class Booking {

    private Player Player;
    private PlayGround PlayGround;
    private Owner Owner;
    private TimeSlot TimeSlot;
    private TimeSlot BookingTime;
    public static ArrayList<Booking> bookings= new ArrayList <Booking>();
    /**the SetOwner  method assign a given value to the  info of user as owner
     *@param Owner is the value to setOwner  object*/
    public void SetOwner(Owner Owner) {
        this.Owner=Owner;
    }
    /**the SetPlayGround method assign a given value to the info of playground
     *@param PlayGround is the value to setPlayGround  object*/
    public void SetPlayGround(PlayGround PlayGround) {
        this.PlayGround=PlayGround;
    }
    /**the getTimeSlot method return the value of of the timeslot of playground
     *@return return the value of the timeslot
     */
    public TimeSlot getTimeSlot()
    {
        return TimeSlot;
    }
    /**the cancelBooking method of class booking that remove an object from arraylist booking
     */
    public void cancelBooking(Booking n)
    {
        bookings.remove(n);
    }
}

