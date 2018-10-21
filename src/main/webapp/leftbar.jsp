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
    .bdnames {
        background: #272B30;
        border: none;
    }
    .bdLink {
        color: -webkit-link;
        cursor: pointer;
        text-decoration: underline;
    }
</style>

<script>
    $(document).ready(function () {
	    $('.bdnames').hide();
    });

	function postLink(num) {
        var board_no = document.getElementById("bd_name"+num).value;
        console.log(board_no);
        var page = 1;
        var pageSize = 10;
        location.href = "/post?no="+board_no+"&page="+page+"&pageSize="+pageSize;
	}
</script>
<div id="leftbar">
    <ul class="list-group">
        <li class="list-group-item d-flex justify-content-between align-items-center">
            <a id="createBoard" href="/boardList">게시판 생성</a>
            <span class="badge badge-primary badge-pill">${boardList.size()}</span>
        </li>
        <li class="list-group-item d-flex justify-content-between align-items-center">
        </li>
        <c:forEach items="${boardList}" var="boardVo" varStatus="i">
            <c:choose>
                <c:when test="${boardVo.bd_use == 'Y'}">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <a  class="bdLink" onclick="postLink(${i.index})">${boardVo.bd_name}</a>
                        <span class="badge badge-primary badge-pill">0</span>
                    </li>
                    <input type="text" id="bd_name${i.index}" class="bdnames" value="${boardVo.bd_no}" />
                </c:when>
            </c:choose>
        </c:forEach>
    </ul>
</div>