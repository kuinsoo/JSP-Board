<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-15
  Time: 오후 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style type="text/css">
    .tdSet {
        width: 100%;
    }
    #boardName{
        background: #272B30;
        border: none;
        color: #fff;
        width: 150px;
    }
</style>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">
            <div class="form-group">
                <fieldset disabled="">
                    <input class="form-control" id="boardName" type="text" placeholder="게시판 이름" disabled="">
                </fieldset>
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Default input" id="inputDefault">
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <select class="custom-select">
                    <option selected="">사용여부를 선택해주세요.</option>
                    <option value="Y">사용</option>
                    <option value="N">비사용</option>
                </select>
            </div>
        </th>
        <th scope="col"><button name="bnt">생성</button> </th>
    </tr>
    </thead>
    <tbody>

    <tr class="table-Default">
        <th scope="row">글번호</th>
        <td> 제목</td>
        <td> 작성자</td>
        <td> 날짜</td>
    </tr>
    </tbody>
</table>