package org.fai.study.test.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
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
        var classRooms = entityManager.createStoredProcedureQuery("GetClassRoom",ClassRoom.class).getResultList();
        req.setAttribute("classRoomList", classRooms);
        req.getRequestDispatcher("/views/classroom.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
