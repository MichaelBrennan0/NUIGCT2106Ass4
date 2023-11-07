/**
 * Class to hold trip information
 *
 * @author  Michael Brennan I.D. 22759599
 * @version 31 Oct
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Trip
{
String startingLocation, destination;//strings to show starting location and final location.
LocalDateTime depart, arrive;//two date time objects fro depart date/time and arrival date/time.
int seatCount;//number of available seats on said bus
String busNumber;//the rout or bus number for that trip

public Trip(String startingLocation, String destination, LocalDateTime depart,
                        LocalDateTime arrive, int seatCount,String busNumber){

this.startingLocation = startingLocation;
this.destination = destination;
this.depart = depart;
this.arrive = arrive;
this.seatCount = seatCount;
this.busNumber = busNumber;

}

//this is a method used to reduce the number of availiable seats when an order is placed
// if there is not enough seats then a false boolean is returned to tell the user that 
//this has failed.
public boolean takeSeat(byte numberOfSeats){
    if(numberOfSeats > seatCount){
        return false;
    }
    
    seatCount = seatCount - numberOfSeats;
    return true;
}


}
