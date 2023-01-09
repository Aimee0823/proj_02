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
@WebServlet("/tcm/update")
public class TCMUpdateServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req,resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");
            int id = Integer.parseInt(req.getParameter("id"));
            int number = Integer.parseInt(req.getParameter("number"));
            String name = req.getParameter("name");
            String alias = req.getParameter("alias");
            int type = Integer.parseInt(req.getParameter("type"));
            String bjyw = req.getParameter("bjyw");
            String zhuzhi = req.getParameter("zhuzhi");
            String xingwei = req.getParameter("xingwei");
            String chandi = req.getParameter("chandi");
            String dosage = req.getParameter("dosage");
            String taboo = req.getParameter("taboo");
            String processing = req.getParameter("processing");
            String note = req.getParameter("note");

            TraditionalChineseMedicine medicine = new TraditionalChineseMedicine();
            medicine.setId(id);
            medicine.setNumber(number);
            medicine.setName(name);
            medicine.setAlias(alias);
            medicine.setType(type);
            medicine.setBjyw(bjyw);
            medicine.setZhuzhi(zhuzhi);
            medicine.setXingwei(xingwei);
            medicine.setChandi(chandi);
            medicine.setDosage(dosage);
            medicine.setTaboo(taboo);
            medicine.setProcession(processing);
            medicine.setNote(note);

            TCMDao tcmDao = new TCMDao();
            try {
                tcmDao.update(medicine);
//            req.getRequestDispatcher("/tcm/list").forward(req,resp);
                resp.sendRedirect("list");
            } catch (Exception e) {
                e.printStackTrace();
                new RuntimeException("更新TCM失败");
            }
        }
    }