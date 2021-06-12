/**
 * @authour saad ahmed saad, group_S 22,  20190237
 */
package GoFoSystem;
public class TimeSlot extends PlayGround{
    private String month;
    private String Day;
    private int Hour;
    private boolean status;

    /** class default constructor  that specify default value "true" to attribute status
     *
     */
    public TimeSlot(){
        status=true;
    }
    /**the setMoth method assign agiven value to the month of TimeSlot
     *@param month is the value to set timeslot */
    public void SetMonth(String month)
    {
        this.month=month;
    }
    /** the setDay method assign agiven value to the day of TimeSlot
     * @param Day is the value to set timeslot
     **/
    public void SetDay(String Day)
    {
        this.Day=Day;
    }
    /**the setHours method assign agiven value to the hours of TimeSlot
     *@param Hour is the value to set timeslot */
    public void SetHour(int Hour)
    {
        this.Hour=Hour;
    }
    /**the setStatus method assign agiven value to the status of TimeSlot
     *@param status is the value to set TimeSlot */
    public void SetStatus(boolean status)
    {
        this.status=status;
    }

    /** the getMonth method return the value of of the TimeSlot Month
     *@return return the value of the timeslot month
     */
    public String getMonth()
    {
        return month;
    }

    /**the getDay method return the value of of the TimeSlot day
     *@return return the value of the timeslot day
     */
    public String getDay()
    {
        return Day;
    }

    /**the getHours method return the value of of the TimeSlot hours
     *@return return the value of the timeslot hours
     */
    public int getHour()
    {
        return Hour;
    }
}
