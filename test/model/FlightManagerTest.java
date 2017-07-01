/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author james TODO
 */
public class FlightManagerTest {


    public FlightManagerTest() {
    }

    /**
     * Test of getFilteredFlights method, of class FlightManager.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetFilteredFlights() throws ParseException {
        System.out.println("getFilteredFlights");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date flightDate = sdf.parse("2017-06-30 00:00:00");
        FlightManager instance = new FlightManager();
        List<Flight> expResult = Arrays.asList(
                new Flight(36, sdf.parse("2017-06-30 00:00:00"), sdf.parse("2017-06-30 10:00:00"), sdf.parse("2017-06-30 10:30:00"), "SCHEDULED", 1, 0, 1),
                new Flight(37, sdf.parse("2017-06-30 00:00:00"), sdf.parse("2017-06-30 14:00:00"), sdf.parse("2017-06-30 14:30:00"), "SCHEDULED", 1, 0, 1)
        );
        List<Flight> result = instance.getFilteredFlights(flightDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllFlights method, of class FlightManager.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetAllFlights() throws ParseException {
        System.out.println("getAllFlights");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        FlightManager instance = new FlightManager();
        List<Flight> expResult = Arrays.asList(
                new Flight(34, sdf.parse("2017-06-29 00:00:00"), sdf.parse("2017-06-29 10:00:00"), sdf.parse("2017-06-29 10:30:00"), "SCHEDULED", 1, 0, 1),
                new Flight(35, sdf.parse("2017-06-29 00:00:00"), sdf.parse("2017-06-29 14:00:00"), sdf.parse("2017-06-29 14:30:00"), "SCHEDULED", 2, 0, 1),
                new Flight(36, sdf.parse("2017-06-30 00:00:00"), sdf.parse("2017-06-30 10:00:00"), sdf.parse("2017-06-30 10:30:00"), "SCHEDULED", 3, 0, 1),
                new Flight(37, sdf.parse("2017-06-30 00:00:00"), sdf.parse("2017-06-30 14:00:00"), sdf.parse("2017-06-30 14:30:00"), "SCHEDULED", 4, 0, 1),
                new Flight(38, sdf.parse("2017-07-01 00:00:00"), sdf.parse("2017-07-01 10:00:00"), sdf.parse("2017-07-01 10:30:00"), "SCHEDULED", 1, 0, 1),
                new Flight(39, sdf.parse("2017-07-01 00:00:00"), sdf.parse("2017-07-01 14:00:00"), sdf.parse("2017-07-01 14:30:00"), "SCHEDULED", 2, 0, 1),
                new Flight(40, sdf.parse("2017-07-02 00:00:00"), sdf.parse("2017-07-02 10:00:00"), sdf.parse("2017-07-02 10:30:00"), "SCHEDULED", 3, 0, 1),
                new Flight(41, sdf.parse("2017-07-02 00:00:00"), sdf.parse("2017-07-02 14:00:00"), sdf.parse("2017-07-02 14:30:00"), "SCHEDULED", 4, 0, 1),
                new Flight(42, sdf.parse("2017-07-03 00:00:00"), sdf.parse("2017-07-03 10:00:00"), sdf.parse("2017-07-03 10:30:00"), "SCHEDULED", 1, 0, 1),
                new Flight(43, sdf.parse("2017-07-03 00:00:00"), sdf.parse("2017-07-03 14:00:00"), sdf.parse("2017-07-03 14:30:00"), "SCHEDULED", 2, 0, 1)
        );
        List<Flight> result = instance.getAllFlights();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFlight method, of class FlightManager.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetFlight() throws ParseException {
        System.out.println("getFlight");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        int id = 36;
        FlightManager instance = new FlightManager();
        Flight expResult = new Flight(36, sdf.parse("2017-06-30 00:00:00"), sdf.parse("2017-06-30 10:00:00"), sdf.parse("2017-06-30 10:30:00"), "SCHEDULED", 3, 0, 1);
        Flight result = instance.getFlight(id);
        assertEquals(expResult, result);
    }

}
