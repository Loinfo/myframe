package org.cilion.myframe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: liangxin
 * @Date: 2018/10/14
 * @Description: 继承HttpServlet 进行get请求出来
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        java.text.DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dataFormat.format(new Date());
        req.setAttribute("currentTime", currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
