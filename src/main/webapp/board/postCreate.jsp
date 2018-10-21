<%--
  Created by IntelliJ IDEA.
  User: "Mr.KKu"
  Date: 2018-10-21
  Time: 오후 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style type="text/css">
    #pc_ta {
        height: 455px;
    }
    #pc_bnt {
        width: 100px;
    }
    #pc_bnt_div {
        text-align: right;
    }
</style>


<div class="form-group">
    <label class="col-form-label" for="inputDefault">제목</label>
    <input type="text" class="form-control" name="pc_tt" placeholder="제목을 입력하세요." id="inputDefault">
</div>

<div class="form-group">
    <label for="pc_ta">내용</label>
    <textarea class="form-control" id="pc_ta" name="pc_ta" rows="3" placeholder="내용을 입력하세요."></textarea>
</div>

<div class="form-group">
    <label for="exampleInputFile">첨부파일</label>
    <input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
    <small id="fileHelp" class="form-text text-muted">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>
</div>

<div id="pc_bnt_div">
<button type="button" id="pc_bnt" class="btn btn-outline-success">글쓰기</button>
</div>