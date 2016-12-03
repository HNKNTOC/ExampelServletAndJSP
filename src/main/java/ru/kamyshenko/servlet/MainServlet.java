package ru.kamyshenko.servlet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ru.kamyshenko.model.beer.BeerBrand;
import ru.kamyshenko.model.beer.BeerColor;
import ru.kamyshenko.model.beer.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *  Main servlet handles Request for main page.
 */
public class MainServlet extends HttpServlet {
    public static final String BEER_BRANDS = "BeerBrands";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view =
                req.getRequestDispatcher("index.jsp");
        view.forward(req,resp);
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        getServletContext().log("color = "+color);

        BeerExpert expert = new BeerExpert();
        List<BeerBrand> beerBrands = expert
                .selectByColor(BeerColor.valueOf(color));

        resp.setContentType("text/html");
        req.setAttribute(BEER_BRANDS,beerBrands);
        RequestDispatcher view =
                req.getRequestDispatcher("result.jsp");
        view.forward(req,resp);
    }
}
