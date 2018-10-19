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
        width: 200px;
    }
    #boardName{
        background: #272B30;
        border: none;
        color: #fff;
        width: 150px;
    }
    #theadeCul{
        line-height: 5;
        font-size: 18px;
        text-align: center;
    }
    #tbodyCul{
        line-height: 3;
        font-size: 18px;
        text-align: center;
    }
    .boardBtn {
        width: 150px;
    }
    .texts{
        background: #ced4da;
    }
    .textSelect{
        background-color: #fff;
    }
</style>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col"><div id="theadeCul" >게시판 이름</div></th>
        <th scope="col">
            <div class="form-group">
                <input type="text" class="form-control texts" placeholder="게시판 이름을 적어주세요" >
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <select class="custom-select texts">
                    <option selected="" >사용여부를 선택해주세요</option>
                    <option value="Y" class="textSelect">사용</option>
                    <option value="N" class="textSelect">비사용</option>
                </select>
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <button type="button"  class="btn btn-outline-success boardBtn">생성</button>
                <button type="button"  class="btn btn-outline-danger boardBtn">취소</button>
            </div>
        </th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="col"><div id="tbodyCul" >게시판 이름</div></th>
        <th scope="col">
            <div class="form-group">
                <input type="text" class="form-control texts" placeholder="게시판 이름을 적어주세요" >
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <select class="custom-select texts">
                    <option selected="">사용여부를 선택해주세요</option>
                    <option value="Y" class="textSelect">사용</option>
                    <option value="N" class="textSelect">비사용</option>
                </select>
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <button type="button"   class="btn btn-outline-info boardBtn">수정</button>
                <button type="button"   class="btn btn-outline-danger boardBtn">취소</button>
            </div>
        </th>
    </tr>
    </tbody>
</table>