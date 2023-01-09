package servlet.TraditionalChineseMedicineServlet;

import dao.TCMDao;
import pojo.TraditionalChineseMedicine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName TCMUpdateServlet
 * @Description
 * @Author wangyang
 * @Date 2022/11/15 11:10
 * @Version 1.0
 */
@WebServlet("/tcm/updateProc")
public class TCMUpdateProcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        TCMDao tcmDao = new TCMDao();
        try {
            TraditionalChineseMedicine medicine = tcmDao.queryById(id);
            req.setAttribute("medicine",medicine);
            req.getRequestDispatcher("/jsp/tcm/TCMUpdate.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
