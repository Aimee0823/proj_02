package servlet.TraditionalChineseMedicineServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName TCMAddProcServlet
 * @Description
 * @Author wangyang
 * @Date 2022/11/15 10:21
 * @Version 1.0
 */
@WebServlet("/tcm/addProc")
public class TCMAddProcServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/jsp/tcm/TCMAdd.jsp").forward(req, resp);
    }
}
