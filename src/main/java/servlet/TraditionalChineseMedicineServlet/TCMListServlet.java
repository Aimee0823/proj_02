package servlet.TraditionalChineseMedicineServlet;



import dao.TCMDao;
import pojo.TraditionalChineseMedicine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName TCMListServlet
 * @Description
 * @Author wangyang
 * @Date 2022/11/11 16:01
 * @Version 1.0
 */
@WebServlet(urlPatterns = {"/tcm/list"})
public class TCMListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        TCMDao tcmDao = new TCMDao();
        List<TraditionalChineseMedicine> list=null;
        String name = req.getParameter("name");
        String alias=req.getParameter("alias");
        String bjyw =req.getParameter("bjyw");
        System.out.println(name+"0"+alias+"0"+bjyw);
        if (name ==null){
            name = "";
        }
        if (alias == null){
            alias = "";
        }
        if (bjyw == null){
            bjyw ="";
        }
        try {
            list= tcmDao.queryAll(name,alias,bjyw);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        req.setAttribute("list",list);
        req.setAttribute("name",name);
        req.setAttribute("alias",alias);
        req.setAttribute("bjyw",bjyw);
        req.getRequestDispatcher("/jsp/tcm/TCM.jsp").forward(req,resp);
    }
}
