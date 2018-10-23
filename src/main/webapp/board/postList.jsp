<%--
  Created by IntelliJ IDEA.
  User: "Mr.KKu"
  Date: 2018-10-21
  Time: 오전 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style type="text/css">
    thead>tr:first-child>th {
        text-align: center;
        width: 100px;
        font-size: 0.7375rem;
        padding: 5px 5px 5px 5px;
    }

    thead>tr:first-child>th+th {
        font-size: 0.9375rem;
        padding: 0.75rem;
    }
    thead>tr:first-child>th+th+th{
        font-size: 0.7375rem;
        padding: 5px 5px 5px 5px;
    }
    thead>tr:first-child>th+th+th+th{
        font-size: 0.9375rem;
        padding: 0.75rem;
    }


    /* tbody */
    .tbodyTr th {
        text-align: center;
    }
    .tbodyTr td {
        text-align: left;
        text-indent: 2px;
        display: inline-block;
        width: 800px;
        white-space: nowrap;
        overflow: hidden;
        text-overflow: ellipsis;

    }
    .tbodyTr td+td {
        display: table-cell;
        width: 0px;
        text-align: center;
        font-size: 0.8375rem;

    }
    .tbodyTr td+td+td {
        text-align: center;
        font-size: 0.9375rem;
    }

    /* 페이지 바 */
    #pageBar {
        display: table;
        margin: 0 auto
    }
</style>
<script>
	function createPost() {
		location.href= "/postWrite?no=${post_groupno}&recursion="
	}
</script>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">게시글<br/>번호</th>
        <th scope="col">제목</th>
        <th scope="col">작성자<br/>아이디</th>
        <th scope="col">작성일시</th>
    </tr>
    </thead>


    <tbody>
    <c:forEach items="${postList}" var="postVo">
        <tr class="table-primary tbodyTr">
            <th scope="row">${postVo.getPost_rnum()}</th>
            <td> <a href="/postDetail?postNo=${postVo.getPost_no()}" style="cursor: pointer; text-decoration:none;" >${postVo.getPost_sub()}</a></td>
            <td>${postVo.getPost_writer()}</td>
            <td><fmt:formatDate value="${postVo.getPost_rdate()}" /></td>
        </tr>
    </c:forEach>
    </tbody>

    <%-- 페이징 처리--%>
    <tr class="table-primary tbodyTr">
        <th scope="row" colspan="3">
            <div style="margin: 0px auto;">
                <ul class="pagination">
                    <c:choose>
                        <c:when test="${page eq 1}">
                            <li class="page-item disabled">
                                <a class="page-link" href="#">&laquo;</a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item">
                                <a class="page-link" href="/post?no=${post_groupno}&page=${page-1}&pageSize=10">&laquo;</a>
                            </li>
                        </c:otherwise>
                    </c:choose>

                    <%-- <li class="page-item active">
                               <a class="page-link" href="#">1</a>
                           </li>--%>
                    <c:forEach begin="1" end="${postAllList.size()/10+1}" varStatus="i">
                        <c:choose>
                            <c:when test="${page eq i.index}">
                                <li class="page-item active">
                                    <a class="page-link" href="/post?no=${post_groupno}&page=${i.index}&pageSize=10">${i.index}</a>
                                </li>
                            </c:when>

                            <c:when test="${page ne i.index}">
                                <li class="page-item">
                                    <a class="page-link" href="/post?no=${post_groupno}&page=${i.index}&pageSize=10">${i.index}</a>
                                </li>
                            </c:when>
                        </c:choose>
                    </c:forEach>

                   <fmt:parseNumber var="maxPage" value="${postAllList.size()/10+1}" integerOnly="true" scope="page" />
                    <c:choose>
                        <c:when test="${page eq maxPage}">
                            <li class="page-item disabled">
                                <a class="page-link" href="#">&raquo;</a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item">
                                <a class="page-link" href="/post?no=${post_groupno}&page=${page+1}&pageSize=10">&raquo;</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </th>
        <th>
            <button type="button" class="btn btn-outline-success" onclick="createPost()">글쓰기</button>
        </th>
    </tr>


</table>
