package GoFoSystem;
import java.util.*;
/**
 * @author Heba_tullah Adel, group-S 22,  20190609
 * @author Esraa Ragab Ali,  group_S 22 , 20190090
 */
public class GoFo {
    public ArrayList<Player> players = new ArrayList<Player>();
    public ArrayList<PlayGround> playgrounds = new ArrayList<PlayGround>();
    public ArrayList<Owner> owners = new ArrayList<Owner>();
    public Booking bookings = new Booking();
    /**function to searchByName to get the playground when user enter the name of playGround
     *@param name string used in searching process to display playground with the same name.
     *If the text is null, the tool tip is turned off for this component.
     */
    public void searchByName(String name) {
        for (int i = 0; i < playgrounds.size(); i++) {
            if (playgrounds.get(i).getName().equals(name)) {
                System.out.println(playgrounds.get(i));
            }
        }
    }
    /**function to searchById to get the playground when user enter the id of playground
     *@param id integer used in searching process to display playground with the same id.
     */
    public void searchById(int id) {
        System.out.println(playgrounds.get(id-1));
    }
    /**function to searchByLocation to get the playground when user enter the location of playground
    @param location string used in searching process to display playground with the same location..    */
    public void searchByLocation(String location) {
        for (int i = 0; i < playgrounds.size(); i++) {
            if (playgrounds.get(i).getLocation().equals(location)) {
                System.out.println(playgrounds.get(i));
            }
        }
    }
    /** function signup for user to enter his information
    @param name
    @param phone
    @param password
    @param email
    @param location
    @param choice
    *and the system store it in arraylist
    */
    public void signup(String name, String phone, String password, String email, String location, int choice) {
        if (choice == 1) {
            Player player1 = new Player(name, phone, location, password, email);
            players.add(player1);
            System.out.print(player1 + "\n");
        }
        if (choice == 2) {
            Owner owner1 = new Owner(name, phone, location, password, email);
            owners.add(owner1);
            System.out.print(owner1 + "\n");
        }

    }
    /**function RigesterPlayGround for the user to register aplayground and the system treat him as a owner
     *@param name
     *@param Location
     *@param size
     * @param availableHoures
     * @param cancelationPeriod
    */
    public PlayGround RegisterPlayground(String name, String Location, double size,float price, int availableHoures, int cancelationPeriod,Owner owner) {
        PlayGround playground1 = new PlayGround(name, Location, size,price, availableHoures, cancelationPeriod);
        playground1.setStatus(true);
        playgrounds.add(playground1);
        playground1.setOwner(owner);
        return playground1;
    }
    /**function display to display aplay ground for user
    @param searchType If the text is null, the tool is turned off for this component.
    */
    public void display(String searchType) {
        Scanner input = new Scanner(System.in);
        if (searchType == "name") {
            System.out.println("Enter Playground name");
            String name = input.next();
            searchByName(name);
        }
        if (searchType == "id") {
            System.out.println("Enter Playground id ");
            int id = input.nextInt();
            searchById(id);
        }
        if (searchType == "location") {
            System.out.println("Enter Playground location ");
            String location = input.next();
            searchByLocation(location);
        }
    }
    /** function setbooking for user to book a playground
    @param  player  (he enter as object of class player )
    @param  playground (he enter as object of class playground )
    @param  owner (he enter as object of class owner)
    @param  timeslot (he enter as object of class time slot )
    */
    public void setBooking(Player player, PlayGround playground, Owner owner, TimeSlot timeslot) {
        Booking book = new Booking();
        if (playground.getStatus()) {
            bookings.bookings.add(book);
        }
    }
}