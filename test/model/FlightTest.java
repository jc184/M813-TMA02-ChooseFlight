/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author james
 */
public class FlightTest {

    public FlightTest() {
    }

    /**
     * Test of getFlightId method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetFlightId() throws ParseException {
        System.out.println("getFlightId");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        Integer expResult = 37;
        Integer result = instance.getFlightId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightId method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetFlightId() throws ParseException {
        System.out.println("setFlightId");
        Integer flightId = 37;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(null, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setFlightId(flightId);
        System.out.println(instance);
        assertEquals(instance.getFlightId(), flightId);

    }

    /**
     * Test of getFlightDate method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetFlightDate() throws ParseException {
        System.out.println("getFlightDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        Date expResult = d;
        Date result = instance.getFlightDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightDate method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetFlightDate() throws ParseException {
        System.out.println("setFlightDate");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Date flightDate = sdf.parse("2017-07-01 00:00:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setFlightDate(flightDate);
        assertTrue(instance.getFlightDate().equals(sdf.parse("2017-07-01 00:00:00")));
    }

    /**
     * Test of getLeaveDateTime method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetLeaveDateTime() throws ParseException {
        System.out.println("getLeaveDateTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        Date expResult = dt1;
        Date result = instance.getLeaveDateTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLeaveDateTime method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetLeaveDateTime() throws ParseException {
        System.out.println("setLeaveDateTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date leaveDateTime = sdf.parse("2017-06-30 10:00:00");
        
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setLeaveDateTime(leaveDateTime);
        assertEquals(leaveDateTime, dt1);
    }

    /**
     * Test of getArrivalDateTime method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetArrivalDateTime() throws ParseException {
        System.out.println("getArrivalDateTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        Date expResult = dt2;
        Date result = instance.getArrivalDateTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArrivalDateTime method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetArrivalDateTime() throws ParseException {
        System.out.println("setArrivalDateTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date arrivalDateTime = sdf.parse("2017-06-30 10:30:00");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setArrivalDateTime(arrivalDateTime);
        assertEquals(arrivalDateTime, dt2);
    }

    /**
     * Test of getFlightStatus method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetFlightStatus() throws ParseException {
        System.out.println("getFlightStatus");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        String expResult = "SCHEDULED";
        String result = instance.getFlightStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightStatus method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetFlightStatus() throws ParseException {
        System.out.println("setFlightStatus");
        String flightStatus = "CANCELLED";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setFlightStatus(flightStatus);
        assertEquals(instance.getFlightStatus(), "CANCELLED");
    }

    /**
     * Test of getGateNumber method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetGateNumber() throws ParseException {
        System.out.println("getGateNumber");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        int expResult = 1;
        int result = instance.getGateNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGateNumber method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetGateNumber() throws ParseException {
        System.out.println("setGateNumber");
        int gateNumber = 2;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setGateNumber(gateNumber);
        assertEquals(instance.getGateNumber(), 2);
    }

    /**
     * Test of getStops method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetStops() throws ParseException {
        System.out.println("getStops");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        int expResult = 0;
        int result = instance.getStops();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStops method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetStops() throws ParseException {
        System.out.println("setStops");
        int stops = 1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setStops(stops);
        assertEquals(instance.getStops(), 1);
    }

    /**
     * Test of getAircraftAircraftId method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetAircraftAircraftId() throws ParseException {
        System.out.println("getAircraftAircraftId");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        int expResult = 1;
        int result = instance.getAircraftAircraftId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAircraftAircraftId method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testSetAircraftAircraftId() throws ParseException {
        System.out.println("setAircraftAircraftId");
        int aircraftAircraftId = 2;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setAircraftAircraftId(aircraftAircraftId);
        assertEquals(instance.getAircraftAircraftId(), 2);
    }

    /**
     * Test of getRouteRouteId method, of class Flight.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetRouteRouteId() throws ParseException {
        System.out.println("getRouteRouteId");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        Route expResult = null;
        Route result = instance.getRouteRouteId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRouteRouteId method, of class Flight.
     * @throws java.text.ParseException
     * null because RouteRouteId is absent from the Constructor in Flight
     */
    @Test
    public void testSetRouteRouteId() throws ParseException {
        System.out.println("setRouteRouteId");
        Route routeRouteId = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse("2017-06-30 00:00:00");
        Date dt1 = sdf.parse("2017-06-30 10:00:00");
        Date dt2 = sdf.parse("2017-06-30 10:30:00");
        Flight instance = new Flight(37, d, dt1, dt2, "SCHEDULED", 1, 0, 1);
        instance.setRouteRouteId(routeRouteId);
        assertEquals(instance.getRouteRouteId(), null);
    }

}
