package com.ra.gi_cung_duoc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// annotation - chú thích
@WebServlet(name = "CalculateServlet", value = "/calculate-servlet")
public class CalculateServlet extends HttpServlet
{

    // method GET - a form-method-get
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doGet(req, resp);
    }

    // method POST - form-method-post
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // phần này nhận dữ liệu về servlet
        String desc = req.getParameter("desc");
        Double price = Double.parseDouble(req.getParameter("price"));
        Double discount = Double.parseDouble(req.getParameter("discount"));

        // tính toán logic
        Double discountAmount = price * discount * 0.01;
        Double discountPrice = price - discountAmount;

        // gửi dữ liệu sang jsp
        req.setAttribute("desc", desc);
        req.setAttribute("price", price);
        req.setAttribute("discount", discount);
        req.setAttribute("discountAmount", discountAmount);
        req.setAttribute("discountPrice", discountPrice);

        // điều hướng sang trang jsp
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
