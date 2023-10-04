<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

    <title>Clearing Session Data</title>

</head>

<body>

    <%

        // Get the session object

       // HttpSession session = request.getSession(false);



        // Invalidate the session

        if (session != null) {

            session.invalidate();

        }

    %>

    <h1>Session data has been cleared.</h1>

    <p><a href="index.jsp">Click here</a> to start a new session.</p>

</body>

</html>