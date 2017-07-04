<%-- 
    Document   : flightinfopage
    Created on : 29-Jun-2017, 15:18:11
    Alba Airways application M813-TMA02-ChooseFlight
    @author james chalmers F6418079
    @version 1.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Flight" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="outer">
            <div class="header"><h1>Alba Airways</h1></div>
            <div class="box"><h2>Flight Info page</h2>


                <% Flight flight = (Flight) request.getAttribute("Flight");%>
                <table cellspacing="8" border="0">
                    <tr>
                        <td align="left"><p>Flight Id:</p></td>
                        <td><p><%= flight.getFlightId()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Flight Date:</p></td>
                        <td><p><%= flight.getFlightDate()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Leave Date Time:</p></td>
                        <td><p><%= flight.getLeaveDateTime()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Arrive Date Time:</p></td>
                        <td><p><%= flight.getArrivalDateTime()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Flight Status:</p></td>
                        <td><p><%= flight.getFlightStatus()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Gate Number:</p></td>
                        <td><p><%= flight.getGateNumber()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Stops:</p></td>
                        <td><p><%= flight.getStops()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Route ID:</p></td>
                        <td><p><%= flight.getRouteRouteId()%></p></td>
                    </tr>
                    <tr>
                        <td align="left"><p>Aircraft ID:</p></td>
                        <td><p><%= flight.getAircraftAircraftId()%></p></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="button" value="back" onclick="location.href = document.referrer; return false;" style="width:75px" />
                        </td>
                    </tr>
                </table>
            </div>
    </body>
</html>
