<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-15
  Time: 오후 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
    MemberVo memberVo = (MemberVo)session.getAttribute("memVo");
%>
<html>
<head>
    <!-- 헤더  -->
    <%@include file="/header.jsp"%>

</head>
<body>
<%-- nav --%>
<%@include file="/nav.jsp"%>
<%-- left bar --%>
<%@include file="/leftbar.jsp"%>
<%-- container --%>
<div class="container" id="">
    <%-- 메인알림창 --%>
    <%@include file="/container.jsp"%>
    <%--
     &lt;%&ndash; 폼창 &ndash;%&gt;
     <%@include file="/forms.jsp"%>
     &lt;%&ndash; 모달창 &ndash;%&gt;
     <%@include file="/modal.jsp"%>
     &lt;%&ndash; 다른 카드 &ndash;%&gt;
     <%@include file="/cardHeader.jsp"%>
     &lt;%&ndash; 리스트 그룹 &ndash;%&gt;
     <%@include file="/listGroup.jsp"%>

     &lt;%&ndash; 카드부분 &ndash;%&gt;
     <%@include file="/card.jsp"%>
     --%>
    <%-- footer --%>
    <%@include file="/footer.jsp"%>
</div><%-- container --%>
</body>
</html>
