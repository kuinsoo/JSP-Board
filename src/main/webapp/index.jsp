<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-18
  Time: 오후 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 헤더  -->
    <%@include file="/header.jsp"%>
    <%-- footer --%>
    <%@include file="/footer.jsp"%>
    <title>index.jsp</title>
    <script type="text/javascript">
        $(document).ready(function () {
        	$('.valid-feedback').hide();
            $('#inputId').on('keyup',function (event) {
               if($(this).val() == 'brown') {
	               $('.valid-feedback').show();
               }else {
	               $('.valid-feedback').hide();
               }
            });
        });
    </script>
</head>
<body>
<%-- container --%>
<div class="container" id="">

    <%-- ID 입력 비교 성공시 --%>
    <div class="form-group has-success">
        <label class="form-control-label" for="inputId">아이디 입력</label>
        <input type="text" class="form-control is-valid" id="inputId" name="memId" placeholder="ID">
        <div class="valid-feedback">일치하는 아이디 입니다.</div>
    </div>

    <%--
    비교 실패시
    <div class="form-group has-danger">
        <label class="form-control-label" for="inputDanger1">Invalid input</label>
        <input type="text" value="wrong value" class="form-control is-invalid" id="inputInvalid">
        <div class="invalid-feedback">Sorry, that username's taken. Try another?</div>
    </div>
    --%>


    <%-- Password 입력란 --%>
    <div class="form-group">
        <label for="inputPass">Password</label>
        <input type="password" class="form-control" id="inputPass" name="memPass" placeholder="Password">
    </div>

    <%-- 로그인 버튼 --%>
    <button type="button" class="btn btn-outline-secondary" href="/login">로그인</button>

</div><%-- container --%>
</body>

</html>
