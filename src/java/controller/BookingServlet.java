/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Flight;
import model.FlightManager;

/**
 * Alba Airways application M813-TMA02-ChooseFlight
 * @author james chalmers F6418079
 * @version 1.0
 */
@WebServlet(name = "BookingServlet", urlPatterns = {"/BookingServlet"})
public class BookingServlet extends HttpServlet {

    FlightManager flightManager;

    @Override
    public void init() throws ServletException {
        flightManager = new FlightManager();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException if a SDF Parse error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        String url = "/bookingpage.jsp";
        Date sdfFlightDate = null;

        String submit = request.getParameter("submit");
        if (submit != null && submit.length() > 0) {
            if (submit.equals("show flights")) {
                String flightDate = request.getParameter("FlightDate");
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                sdfFlightDate = formatter.parse(flightDate);
                Calendar cal = Calendar.getInstance();
                cal.setTime(sdfFlightDate);
                cal.getTime();

                request.setAttribute("flightStore", flightManager.getFilteredFlights(sdfFlightDate));

                request.setAttribute("sdfFlightDate", sdfFlightDate);
                request.setAttribute("cal", formatter.format(cal.getTime()));
                url = "/flightpage.jsp";
            } else if (submit.equals("select")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Flight flight = flightManager.getFlight(id);
                request.setAttribute("Flight", flight);
                url = "/flightinfopage.jsp";
            }
        }
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(BookingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(BookingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
