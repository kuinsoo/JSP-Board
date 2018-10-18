<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-15
  Time: 오후 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<!-- 헤더  -->
    <%@include file="/header.jsp"%>
    <title>index.jsp</title>
</head>
<body>
<%-- nav --%>
<%@include file="/nav.jsp"%>
<%-- container --%>
<div class="container" id="">

    <%-- 메인알림창 --%>
    <%@include file="/container.jsp"%>
    <%-- 폼창 --%>
    <%@include file="/forms.jsp"%>
    <%-- 모달창 --%>
    <%@include file="/modal.jsp"%>
    <%-- 다른 카드 --%>
    <%@include file="/cardHeader.jsp"%>
    <%-- 리스트 그룹 --%>
    <%@include file="/listGroup.jsp"%>

    <%-- 카드부분 --%>
    <%@include file="/card.jsp"%>

</div><%-- container --%>
<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />

</body>
<%-- footer --%>
<%@include file="/footer.jsp"%>
</html>
