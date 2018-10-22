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

<div class="form-group" style="width: 766px">
    <fieldset>
        <label class="control-label" for="readOnlyInput">제목</label>
        <input class="form-control" id="readOnlyInput" type="text" readonly="" value="${postVo.getPost_title()}" />
    </fieldset>
</div>

<div class="form-group">
    <label for="smarteditor">내용</label>
    <textarea name="smarteditor" id="smarteditor" rows="10" cols="100" style="width:766px; height:412px;" readonly="readonly" >${postVo.getPost_content()}</textarea>
</div>
