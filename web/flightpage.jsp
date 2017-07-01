<%-- 
    Document   : flightpage
    Created on : 29-Jun-2017, 11:35:51
    Author     : james
--%>

<%@page import="model.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Info Page</title>
    </head>
    <body>
        <div class="outer">
            <div class="header"><h1>Alba Airways</h1></div>
            <div class="box"><h2>View all flights</h2>
                <% ArrayList<Flight> flightStore = (ArrayList<Flight>) request.getAttribute("flightStore");%>
                <table cellpadding="0" cellspacing="0" border="0" id="table" class="sortable">
                    <!-- UNCOMMENT HTML WITH THIS -->      
                    <thead>
                        <tr>
                            <th><h3>Flight Id</h3></th>
                            <th><h3>Flight Date</h3></th>
                            <th><h3>Leave Datetime</h3></th>
                            <th><h3>Arrival DateTime</h3></th>
                            <th><h3>Flight Status</h3></th>
                            <th><h3>Gate Number</h3></th>
                            <th><h3>Stops</h3></th>
                            <th><h3>Route Id</h3></th>
                            <th><h3>Aircraft Id</h3></th>
                            <th><h3>Select</h3></th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Flight flight : flightStore) {%>
                        <tr>
                            <td><%= flight.getFlightId()%></td>
                            <td><%= flight.getFlightDate()%></td>
                            <td><%= flight.getLeaveDateTime()%></td>
                            <td><%= flight.getArrivalDateTime()%></td>
                            <td><%= flight.getFlightStatus()%></td>
                            <td><%= flight.getGateNumber()%></td>
                            <td><%= flight.getStops()%></td>
                            <td><%= flight.getRouteRouteId()%></td>
                            <td><%= flight.getAircraftAircraftId()%></td>
                            <td><form name="selectFlight" action="BookingServlet">
                                    <input type="hidden" value="<%= flight.getFlightId()%>" name="id" />
                                    <input type="submit" value="select" name="submit" /></form></td>
                        </tr>
                        <%}%>
                    </tbody>

            </div>
        </div>
    </body>
</html>
