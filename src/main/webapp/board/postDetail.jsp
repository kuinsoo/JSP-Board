<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-22
  Time: 오후 3:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>


<script src="/SE2/js/HuskyEZCreator.js"></script>
<script type="text/javascript">
	var oEditors = []; // 개발되어 있는 소스에 맞추느라, 전역변수로 사용하였지만, 지역변수로 사용해도 전혀 무관 함.

	$(document).ready(function() {
		$("#attachAdd").click(function() {
			$inputFile = $("<input type=\"file\" name=\"attach\"/>");
			$("#fileForm").append($inputFile);
		});
			// Editor Setting
			nhn.husky.EZCreator.createInIFrame({
				oAppRef: oEditors, // 전역변수 명과 동일해야 함.
				elPlaceHolder: "smarteditor", // 에디터가 그려질 textarea ID 값과 동일 해야 함.
				sSkinURI: "/SE2/SmartEditor2Skin.html", // Editor HTML
				fCreator: "createSEditor2", // SE2BasicCreator.js 메소드명이니 변경 금지 X
				htParams: {
					// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
					bUseToolbar: true,
					// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
					bUseVerticalResizer: true,
					// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
					bUseModeChanger: true,
				}
			});
		});
</script>

<style type="text/css">
    .divForm {
        width: 766px;
    }
    .replyForm {
        width: 600px;
    }
    .replyBtn {
        font-size: 15px;
        line-height: 0;
        padding: 0 0 0 0;
        width: 50px;
        height: 31px
    }
</style>
<div>
    <div class="form-group divForm">
        <fieldset>
            <label class="control-label" for="readOnlyInput">제목</label>
            <input class="form-control" id="readOnlyInput" type="text"  value="${postVo.getPost_title()}" />
        </fieldset>
    </div>
    <%-- 내용 영역 --%>
    <div class="form-group" >
        <label for="smarteditor">내용</label>
        <textarea name="smarteditor" id="smarteditor" rows="10" cols="100" style="width:766px; height:412px;"  >${postVo.getPost_content()}</textarea>
    </div>

    <%-- 버튼 영역 --%>
    <div  class="divForm">
        <div style="width:766px;" >
            <label>File input</label>
            <div id="fileForm" class="form-group" style="width:450px; float: left;">
                <input type="file"  name="attach" class="form-control-file" id="" aria-describedby="fileHelp" multiple />
            </div>
            <div>
                <button type="button" id="attachAdd"> 파일첨부추가</button>
            </div>
        </div>
        <div style="text-align: right; padding-bottom: 35px">
            <button type="button" class="btn btn-outline-info">답글</button>
            <c:if test="${postVo.getPost_writer() eq memVo.getMem_id()}">
                <button type="button" class="btn btn-outline-warning">수정</button>
                <button type="button" class="btn btn-outline-danger">삭제</button>
            </c:if>
        </div>
    </div>

    <%-- 답글 영역 --%>
    <div class="divForm" style="padding-top: 10px; border-top: solid 1px wheat">
        <input type="text" class="replyForm" value="">
        <button type="button" class="btn replyBtn btn-outline-success">등록</button>
        <button type="button" class="btn replyBtn btn-outline-warning">수정</button>
        <button type="button" class="btn replyBtn btn-outline-danger">삭제</button>
    </div>
</div>
