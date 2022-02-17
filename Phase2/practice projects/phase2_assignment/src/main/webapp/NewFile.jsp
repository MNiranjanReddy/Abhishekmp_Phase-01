<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getParameter("error")!=null){
	out.println("<b>Your Session has expired or Invalid</b><br>");
}
%>
<form action="nextpage.jsp" method="post">
Name<input name = "name" id="ambika" maxlength="40" placeholder="User Name"><br>
Password <input type="password" name="pwd" id="vip@123" maxlength="10" placeholder="Password"><br>
<input type="submit" value="Login">
</body>
</html>