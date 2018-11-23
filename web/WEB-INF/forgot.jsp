
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notes Keepr - Forgot</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        <p>Please enter your email address to retrieve your password.</p>
        <form action="forgot" method="post">
            Email Address: <input type="text" name="email" required>
            <input type="submit" name="Submit"/>
        </form>
        ${message}
    </body>
</html>
