package servlet.TraditionalChineseMedicineServlet;

import dao.TCMDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @ClassName TCMDeleteServlet
 * @Description
 * @Author wangyang
 * @Date 2022/11/15 15:00
 * @Version 1.0
 */
@WebServlet("/tcm/delete")
public class TCMDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");

        TCMDao tcmDao = new TCMDao();
        try {
            tcmDao.delete(Integer.parseInt(id));
            resp.sendRedirect("list");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
