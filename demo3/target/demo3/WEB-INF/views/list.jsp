<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
入学情况:
<br>

<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>学校</th>
    </tr>
    <tbody>
    <c:forEach items="${user}" var="users" >
        <tr>
            <td>${users.id}</td>
            <td>${users.name}</td>
            <td>${users.school}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>