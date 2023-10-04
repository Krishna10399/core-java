<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

    <title>Getting Session Data</title>

</head>

<body>

    <%

        // Get the session object

        //HttpSession session = request.getSession(false);



        // Get the session attribute

        String username = (String) session.getAttribute("username");

    %>

    <h1>Hello, <%= username %>!</h1>

    <p>This data is retrieved from the session.</p>

    <p><a href="clearSession.jsp">Click here</a> to clear session data.</p>

</body>

</html>