package org.fai.study.test.controllers;

import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.fai.study.test.entities.ClassRoom;

import java.io.IOException;
import java.util.List;

@WebServlet("/classroom")
public class ClassRoomController extends HttpServlet {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    @Override
    public void init() throws ServletException {
        super.init();
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("ClassRoom doGet");
        var method = req.getParameter("_method");
        if (method != null&&method.toUpperCase()=="PUT"){
            System.out.println("Update ClassRoom");
            doPut(req, resp);
        }
        else {
            var classRooms = entityManager.createStoredProcedureQuery("GetClassRoom", ClassRoom.class).getResultList();
            req.setAttribute("classRoomList", classRooms);
            req.getRequestDispatcher("/views/classroom.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       try{
           var method = req.getParameter("_method");
           if (method != null&&method.toUpperCase()=="PUT"){
               System.out.println("Update ClassRoom");
               doPut(req, resp);
           }
           else if (method != null&&method.toUpperCase()=="DELETE"){
               System.out.println("Delete ClassRoom");
               doDelete(req, resp);
           }
           else {
           System.out.println("ClassRoom doPost");
           var class_name = req.getParameter("class_name");
           var id_class = Integer.valueOf(req.getParameter("id_class"));
           var number = Integer.valueOf(req.getParameter("number_member"));

           System.out.println(class_name + " " + id_class + " " + number);

           entityManager.getTransaction().begin();
           StoredProcedureQuery query = entityManager.createStoredProcedureQuery("INSERT_CLASSROOM");
           query.registerStoredProcedureParameter(1,Integer.class, ParameterMode.IN);
           query.registerStoredProcedureParameter(2,String.class, ParameterMode.IN);
           query.registerStoredProcedureParameter(3,Integer.class, ParameterMode.IN);


           query.setParameter(1,id_class);
           query.setParameter(2,class_name);
           query.setParameter(3,number);
           query.execute();
           entityManager.getTransaction().commit();
           resp.sendRedirect("./classroom");
       }
       }
       catch (Exception e){
           e.printStackTrace();
       }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        entityManager.close();
        entityManagerFactory.close();
    }
}
