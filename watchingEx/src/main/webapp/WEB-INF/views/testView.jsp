<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트화면</title>

<script src="/resources/js/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript">
      $(document).ready(function(){
            var rs = '<c:out value = "${rs}"/>';
            debugger;
            if(rs == "Success_DB_Conncetion"){
                  $("#result").text("디비 연결 성공");
            }else if(rs == "Fail"){
                  $("#result").text("디비 연결 실패");
            }
      });
</script>

</head>
<body>
	<script>
		alert("테스트결과값 출력, ${rs}");
	</script>
	
</body>
</html>