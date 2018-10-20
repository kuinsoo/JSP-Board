<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-10-18
  Time: 오후 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 헤더  -->
    <%@include file="/header.jsp"%>

    <title>index.jsp</title>
    <script type="text/javascript">
        //키업
		/*		$(document).ready(function () {
                    $('.valid-feedback').hide();
                    $('#inputId').on('keyup',function (event) {
                        if($(this).val() == 'brown') {
                            $('.valid-feedback').show();
                        }else {
                            $('.valid-feedback').hide();
                        }
                    });
                });*/

		//다중 클릭 방지
	/*	var doubleSubmitFlag = false;

		function doubleSubmitCheck() {
			if (doubleSubmitFlag) {
				return doubleSubmitFlag;
			} else {
				doubleSubmitFlag = true;
				return false;
			}
		}*/
  /*      document.onkeydown = fkey;
        document.onkeypress = fkey;
        document.onkeyup = fkey;

        var wasPressed = false;

        function fkey(e) {
        	e = e || window.event;
        	if (wasPressed) return;

        	if (e.keyCode == 116) {
        		location.href = "index.jsp"
            }
        }*/


		$(document).ready(function () {

			$(document).keydown(function (e) {
				var keycode = e.keyCode || e.which;
				if (keycode == 116) {
					console.log(keycode)
					$('#feedback').hide();
					location.href = "/"
				}
			});

			var result = $('#resultText').val();
			$('#resultText').hide();
			$('#feedback').hide();

            if (result == "fail"){
	            $('#feedback').show();
            } else {
	            $('#feedback').hide();
            }

			$('#loginBnt').on('click', function () {
			/*	if (doubleSubmitCheck()) return;*/
				$('#fmId').submit();
			});

			$('#inputPass').keypress (function (event) {
				var keycode = (event.keyCode ? event.keyCode : event.which);
				if (keycode == '13'){
					$('#fmId').submit();
                }
			});
		});
    </script>

    <style type="text/css">
        .loginDivs {
            width: 333px;
            margin: 0 auto 1rem;
        }
        .btn{
            margin-top: 20px;
            width: 100%;
        }
        #map {
            margin: 0 auto 50px;
            width: 333px;
            height: 233px;

        }
        #resultText{
            background: #272B30;
            border: none;
        }
    </style>

</head>
<body>

<%-- container --%>

<div class="container" id="">
    <div id="map"></div>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=971da7f79342d27b553f4e0ffd01e3c5"> </script>
    <script>
		var container = document.getElementById('map');
		var options = {
			center: new daum.maps.LatLng(33.450701, 126.570667),
			level: 1
		};

		var map = new daum.maps.Map(container, options);

		// HTML5의 geolocation으로 사용할 수 있는지 확인합니다
		if (navigator.geolocation) {

			// GeoLocation을 이용해서 접속 위치를 얻어옵니다
			navigator.geolocation.getCurrentPosition(function(position) {

				var lat = position.coords.latitude, // 위도
					lon = position.coords.longitude; // 경도

				var locPosition = new daum.maps.LatLng(lat, lon), // 마커가 표시될 위치를 geolocation으로 얻어온 좌표로 생성합니다
					message = '<div style="padding:5px; font-weight: bold;">현재위치</div>'; // 인포윈도우에 표시될 내용입니다

				// 마커와 인포윈도우를 표시합니다
				displayMarker(locPosition, message);

			});

		} else { // HTML5의 GeoLocation을 사용할 수 없을때 마커 표시 위치와 인포윈도우 내용을 설정합니다

			var locPosition = new daum.maps.LatLng(33.450701, 126.570667),
				message = 'geolocation을 사용할수 없어요..'

			displayMarker(locPosition, message);
		}

		// 지도에 마커와 인포윈도우를 표시하는 함수입니다
		function displayMarker(locPosition, message) {

			// 마커를 생성합니다
			var marker = new daum.maps.Marker({
				map: map,
				position: locPosition
			});

			var iwContent = message, // 인포윈도우에 표시할 내용
				iwRemoveable = true;

			// 인포윈도우를 생성합니다
			var infowindow = new daum.maps.InfoWindow({
				content : iwContent,
				removable : iwRemoveable
			});

			// 인포윈도우를 마커위에 표시합니다
			infowindow.open(map, marker);

			// 지도 중심좌표를 접속위치로 변경합니다
			map.setCenter(locPosition);
		}
    </script>

    <form id="fmId" name="fm" action="/login" method="post">
        <%-- ID 입력 비교 성공시 --%>
        <div class="form-group loginDivs">
            <label class="form-control-label" for="inputId">아이디 입력</label>
            <input type="text" class="form-control is-valid" id="inputId" name="memId" placeholder="ID" autofocus>
        </div>

        <%--
        비교 실패시
        <div class="form-group has-danger">
            <label class="form-control-label" for="inputDanger1">Invalid input</label>
            <input type="text" value="wrong value" class="form-control is-invalid" id="inputInvalid">
            <div class="invalid-feedback">Sorry, that username's taken. Try another?</div>
        </div>
        --%>


        <%-- Password 입력란 --%>
        <div class="form-group loginDivs">
            <label for="inputPass">Password</label>
            <input type="password" class="form-control" id="inputPass" name="memPass" placeholder="Password">
        </div>

        <%-- 로그인 버튼 --%>
        <div class="form-group loginDivs" >
            <div id="feedback" class="invalid-feedback">일치하지 않습니다.</div>
            <button id="loginBnt" type="button" class="btn btn-outline-info" >로그인</button>
        </div>
    </form>
    <input type="text" id="resultText"  value="<%=request.getParameter("result")%>" />
</div><%-- container end --%>
</body>

</html>
