<%@ page import="com.fc.domian.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>fc Hello World!</h2>
<%
    Employee employee = (Employee)request.getAttribute("employee");
%>
<h2><%=employee.getEmp_id()%></h2>
<h2><%=employee.getEmp_addr()%></h2>
<h2><%=employee.getEmp_email()%></h2>
</body>
</html>
