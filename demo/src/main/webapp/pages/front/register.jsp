<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="<%=basePath %>/static/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/static/js/jsonHandler.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="javascript:void(0)" id ="form1">
	<table border="1px" width="600px">
		<tr>
			<td>昵称</td>
			<td><input type="text" name = "username" placeholder="xxxxx"></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name = "pwd"></td>
		</tr>
		<tr>
			<td><input type="submit" value = "注册" id = "register"></td>
			<td><input type="reset" value = "重置"></td>
		</tr>
	</table>
	</table>
</form>
<script type="text/javascript">
	$(function() {
		$("#register").click(function(){
			//json 对象
			var json = $("#form1").serializeObject();
			//将json对象转化为json字符串
			//alert(JSON.stringify(json));
			$.ajax({
				url:"<%= basePath%>/register",
				type:"post",
				dataType:"json",
				data:json,
				success:function(result) {
					alert(11);
				}
			});

		});
	});
</script>
</body>
</html>