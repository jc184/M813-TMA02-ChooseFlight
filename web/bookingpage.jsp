<%-- 
    Document   : bookingpage
    Created on : 29-Jun-2017, 11:35:29
    Author     : james
--%>

<%@page import="model.Flight"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="scripts/datepickercontrol.js"></script>
        <link type="text/css" rel="stylesheet" href="styles/datepickercontrol.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="outer">
            <div class="header"><h1>Alba Airways</h1></div>
            <!-- UNCOMMENT HTML WITH THIS -->

            <div class="box">
                <h2>Booking Page</h2>
                <h3></h3>
                <p></p>



                <form name="form" action="BookingServlet" method="GET">
                    <table cellspacing="8"  border="0">
                        

                        <tr>
                            <td align="left"><p><label for="FlightDate">Date of Travel (yyyy-mm-dd):</label></p></td>
                            <td><input type="text" name="FlightDate" id="FlightDate" value="" datepicker="true" datepicker_format="YYYY-MM-DD"/></td>
                        </tr>
                        <tr>
                            <td align="left"><p>Show daily flights:</p></td>
                            <td><input type="submit" value="show flights" name="submit" style="width:100px" onclick="validate(this.form);return false;"/></td>
                            <td><input type="hidden" name="loginName"  value="<%= session.getAttribute("loginName")%>" /></td><!--    -->
                        </tr>
                    </table>
                </form>

                <br />

            </div>

        </div>
    </body>
</html>
