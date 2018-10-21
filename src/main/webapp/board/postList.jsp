<%--
  Created by IntelliJ IDEA.
  User: "Mr.KKu"
  Date: 2018-10-21
  Time: 오전 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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



</style>
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
    <tr class="table-primary tbodyTr">
        <th scope="row">1111159</th>
        <td>구인수는열심히공부를합니다구인수는열심히공부를합니다삼십이합니다삼십이합니다삼십이합니다삼십이합니다삼십이합니다삼십이다</td>
        <td>구인수r와우</td>
        <td>2018-08-08</td>
    </tr>
    <tr class="table-secondary tbodyTr">
        <th scope="row">1111159</th>
        <td>구인수는열심히공부를합니다구인수는열심히공부를합니다삼십이합니다삼십이합니다삼십이합니다삼십이합니다삼십이합니다삼십이다</td>
        <td>구인수r와우</td>
        <td>2018-08-08</td>
    </tr>
    </tbody>

</table>