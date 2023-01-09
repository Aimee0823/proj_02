package servlet.TraditionalChineseMedicineServlet;

import dao.TCMDao;
import pojo.TcmRelation;
import pojo.TraditionalChineseMedicine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @ClassName TCMDetailServlet
 * @Description
 * @Author wangyang
 * @Date 2022/11/16 14:24
 * @Version 1.0
 */
@WebServlet("/tcm/detail")
public class TCMDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id =Integer.parseInt(req.getParameter("id")) ;

        TCMDao tcmDao = new TCMDao();
        try {
            TcmRelation tcmRelation = tcmDao.detail(id);

            req.setAttribute("tcmRelation",tcmRelation);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            TraditionalChineseMedicine traditionalChineseMedicine=tcmDao.queryById(id);
            req.setAttribute("traditionalChineseMedicine",traditionalChineseMedicine);
            req.getRequestDispatcher("/jsp/tcm/TCMDetail.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
