<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-15
  Time: 오후 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style type="text/css">
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

<script type="application/javascript">
	$(document).ready(function () {
        $('.bdNos').hide();
	});

	function createBoard() {
		var bd_name = document.getElementById("bd_name").value;
		var bd_use = document.getElementById("bd_use").value;
		location.href = "/boardInsert?bd_name="+bd_name+"&bd_use="+bd_use;
	}

	function editBoard(num) {
		var bdName = document.getElementById("bdName"+num).value;
		var stUse = document.getElementById("stUse"+num).value;
		var bdNo = document.getElementById("bdNo"+num).value;
		location.href = "/boardEdit?bdNo="+bdNo+"&bdName="+bdName+"&stUse="+stUse;
	}

</script>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col" ><div id="theadeCul" >게시판 이름</div></th>
        <th scope="col">
            <div class="form-group">
                <input type="text" class="form-control texts" id="bd_name" placeholder="게시판 이름을 적어주세요" value="">
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <select class="custom-select texts" id="bd_use">
                    <option value="Y" selected="" >사용여부를 선택해주세요</option>
                    <option value="Y" class="textSelect">사용</option>
                    <option value="N" class="textSelect">비사용</option>
                </select>
            </div>
        </th>
        <th scope="col">
            <div class="form-group">
                <button type="button"  class="btn btn-outline-success boardBtn create_bd" onclick="createBoard()" >생성</button>
                <button type="button"  class="btn btn-outline-danger boardBtn">취소</button>
            </div>
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${boardList}" var="boardVo" varStatus="i">
        <tr>
            <th scope="col"><div id="tbodyCul" >게시판 이름</div></th>
            <th scope="col">
                <div class="form-group">
                    <input type="text" id="bdName${i.index}" class="form-control texts" placeholder="게시판 이름을 적어주세요"
                           value="${boardVo.bd_name}" >
                </div>
            </th>
            <th scope="col">
                <div class="form-group">
                    <select class="custom-select texts" id="stUse${i.index}" >
                        <c:choose>
                        <c:when test="${boardVo.bd_use  == 'Y' }" >
                        <option value="Y" class="textSelect">사용</option>
                        <option value="N" class="textSelect">비사용</option>
                        </c:when>
                        <c:otherwise>
                        <option value="N" class="textSelect">비사용</option>
                        <option value="Y" class="textSelect">사용</option>
                        </c:otherwise>
                        </c:choose>
                </div>
            </th>
            <th scope="col">
                <div class="form-group">
                    <input type="text" id="bdNo${i.index}" class="bdNos" value="${boardVo.bd_no}" />
                    <button type="button"   class="btn btn-outline-info boardBtn" onclick="editBoard(${i.index})">수정</button>
                    <button type="button"   class="btn btn-outline-danger boardBtn">취소</button>
                </div>
            </th>
        </tr>
    </c:forEach>
    </tbody>
</table>