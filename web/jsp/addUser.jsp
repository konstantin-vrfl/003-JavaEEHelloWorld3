<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add User</title>
    </head>
    <body>
        <p>Add user!</p>

        <%
            if (request.getAttribute("userName") != null) {
                out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
            }
        %>

        <form method="post">
            <label>
                Name:
                <input type="text" name="name"><br/>
            </label>

            <label>
                Password:
                <input type="password" name="pass"><br/>
            </label>
            <button type="submit">Submit</button>
        </form>

        <div>
            <button onclick="location.href='/'">Back to main</button>
        </div>
    </body>
</html>
