<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-19
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style type="text/css">
    #leftbar {
        position: absolute;
        height: 100%;
        width: 200px;
        left: 0px;
        top: 120px;
        z-index: 100;
        margin-bottom: -63px;
    }


</style>


<div id="leftbar">
    <ul class="list-group">
        <li class="list-group-item d-flex justify-content-between align-items-center">
            <a id="createBoard" href="/boardList">게시판 생성</a>
            <span class="badge badge-primary badge-pill">${boardList.size()}</span>
        </li>
        <li class="list-group-item d-flex justify-content-between align-items-center">
        </li>
        <c:forEach items="${boardList}" var="boardVo">
            <c:choose>
                <c:when test="${boardVo.getBd_use() == 'Y'}">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <a href="/postList?no=${boardVo.getBd_no()}">${boardVo.getBd_name()}</a>
                        <span class="badge badge-primary badge-pill">0</span>
                    </li>
                </c:when>
            </c:choose>
        </c:forEach>
    </ul>
</div>