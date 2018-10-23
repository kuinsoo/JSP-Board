<%--------------------------------------------------------------------------------
	* 화면명 : Smart Editor 2.8 에디터 연동 페이지
	* 파일명 : /page/test/index.jsp
--------------------------------------------------------------------------------%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Favicon -->

<!-- jQuery -->
<!-- <script type="text/javascript" src="/js/jquery.js"></script>
<script type="text/javascript" src="/js/jquery-ui.min.js"></script>-->

<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>


<script src="/SE2/js/HuskyEZCreator.js"></script>
<script type="text/javascript">
	var oEditors = []; // 개발되어 있는 소스에 맞추느라, 전역변수로 사용하였지만, 지역변수로 사용해도 전혀 무관 함.

	$(document).ready(function() {

		$("#attachAdd").click(function() {

//html태그중 id가 attachAdd를 클릭한다면

			$inputFile = $("<input type=\"file\" name=\"attach\"/>");

//input type="file" 로 동적 태그생성

			$("#fileForm").append($inputFile);

//fileForm에 생성태그를 추가 한다.

		});

		// Editor Setting
		nhn.husky.EZCreator.createInIFrame({
			oAppRef : oEditors, // 전역변수 명과 동일해야 함.
			elPlaceHolder : "smarteditor", // 에디터가 그려질 textarea ID 값과 동일 해야 함.
			sSkinURI : "/SE2/SmartEditor2Skin.html", // Editor HTML
			fCreator : "createSEditor2", // SE2BasicCreator.js 메소드명이니 변경 금지 X
			htParams : {
				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseToolbar : true,
				// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseVerticalResizer : true,
				// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
				bUseModeChanger : true,
			}
		});


		// 전송버튼 클릭이벤트
		$("#savebutton").click(function(){
			if(confirm("저장하시겠습니까?")) {
				// id가 smarteditor인 textarea에 에디터에서 대입
				oEditors.getById["smarteditor"].exec("UPDATE_CONTENTS_FIELD", []);

				// 이부분에 에디터 validation 검증
				if(validation()) {
					$("#frm").submit();
				}
			}
		})


	});

	// 필수값 Check
	function validation(){
		var contents = $.trim(oEditors[0].getContents());
		if(contents === '<p>&nbsp;</p>' || contents === ''){ // 기본적으로 아무것도 입력하지 않아도 <p>&nbsp;</p> 값이 입력되어 있음.
			alert("내용을 입력하세요.");
			oEditors.getById['smarteditor'].exec('FOCUS');
			return false;
		}

		return true;
	}
</script>
<style>
	#inputDefault {
		width: 766px;
	}
	#savebutton{
		float:right;
		line-height: 5;
	}

</style>

<form action="/postEdit?no=${no}&postNo=${postVo.post_no}" method="post" id="frm" enctype="multipart/form-data">
	<div class="form-group">
		<label class="col-form-label" for="inputDefault">제목</label>
		<input type="text" class="form-control" name="pc_title" placeholder="제목" id="inputDefault" value="${postVo.post_title}">
	</div>

	<textarea name="smarteditor" id="smarteditor" rows="10" cols="100" style="width:766px; height:412px;">${postVo.post_content}</textarea>
	<div style="width:766px;" >
		<label>File input</label>
		<div id="fileForm" class="form-group" style="width:600px; float: left;">
			<input type="file"  name="attach" class="form-control-file" id="" aria-describedby="fileHelp" multiple />
		</div>
		<div>
			<button type="button" id="attachAdd"> 파일첨부추가</button>
		</div>
	</div>
</form>
<input type="button" id="savebutton" class="btn btn-outline-success" value="서버전송" />
