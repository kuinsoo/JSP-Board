<%--
  Created by IntelliJ IDEA.
  User: "Mr.KKu"
  Date: 2018-10-21
  Time: 오전 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <!-- 헤더  -->
    <%@include file="/header.jsp"%>
</head>
<body>
<%-- nav --%>
<%@include file="/nav.jsp"%>
<%-- container --%>
<div class="container" id="">
    <%@ include file="postList.jsp"%>
</div><%-- container --%>

</body>

</html>
