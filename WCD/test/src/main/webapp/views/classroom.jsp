<%@ page import="org.fai.study.test.entities.ClassRoom" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cuongnguyen
  Date: 13/1/25
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Class Room</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h1>Class rooms</h1>
   <div class="container">
       <table class="table table-active">
           <thead>
            <th>Id</th>
            <th>Class Name</th>
            <th>Number</th>
           </thead>
           <tbody>
           <%
               List<ClassRoom> classRooms = (List<ClassRoom>) request.getAttribute("classRoomList");
               if (classRooms != null) {
                   for (ClassRoom classRoom : classRooms) {
                %>
            <tr>
                <td <%= classRoom.getId() %> </td>
                <td> <%= classRoom.getClass_name() %></td>
                <td><%= classRoom.getNumber_member()%></td>
            </tr>
                  <%
                    }
                }
            %>
           </tbody>
       </table>
   </div>
</body>
</html>
