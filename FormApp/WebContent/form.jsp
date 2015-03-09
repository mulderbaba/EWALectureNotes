<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>Insert title here</title>
    </head>

    <body>
        <form action="formServlet" method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="name" />
                    </td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <input type="radio" name="gender" value="F">Female</input>
                        <input type="radio" name="gender" value="M">Male</input>
                    </td>
                </tr>
            </table>
            <input type="submit" />
        </form>
    </body>

    </html>