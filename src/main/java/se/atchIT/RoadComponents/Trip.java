package se.atchIT.RoadComponents;

import java.util.Date;

public class Trip {


    //Fields
    private int TourId;
    private int TripId;
    private String DepartureLocation;
    private String ArrivalLocation;
    private Date DepartureTime;
    private Date ArrivalTime;
    private int BusCapacity;

    //Constructors
    public Trip(int tourId, int tripId, String departureLocation, String arrivalLocation, Date departureTime, Date arrivalTime, int busCapacity) {
        TourId = tourId;
        TripId = tripId;
        DepartureLocation = departureLocation;
        ArrivalLocation = arrivalLocation;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        BusCapacity = busCapacity;
    }


    //Methods


    //Add a trip
    public void addTrip() {


    }


    //Search for a trip
    public void searchForAtrip(String source, String destination) {


    }


}
