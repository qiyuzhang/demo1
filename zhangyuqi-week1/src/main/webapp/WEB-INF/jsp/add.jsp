<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function add() {
		
		var sname = $("[name='sname']").val();	
		var sdate = $("[name='sdate']").val();	
	
		var ids = "";
		$("[name='gid']:checked").each(function() {
			ids+=","+this.value;
		})
		
		ids=ids.substring(1);
		
		$.ajax({
			url:"add.do",
			data:"ids="+ids+"&sname="+sname+"&sdate="+sdate,
			type:"post",
			dataType:"json",
			success: function(data) {
				if(data==0){
					alert("添加失败");
				}
				if(data==1){
					alert("添加店铺成功，添加商品失败");
					location.href="list.do";
				}
				if(data==2){
					alert("添加成功");
					location.href="list.do";
				}
			}
			
		})
		
	}
</script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<h1>新增店铺</h1><hr>
	
	<form action="add.do" method="post">
		店铺名称: <input type="text" name="sname"><br><br>
		
		创建日期: <input type="date" name="sdate"><br><br>
		
		销售商品: <c:forEach items="${list }" var="g">
					<input type="checkbox" name="gid" value="${g.gid }">${g.gname }
				</c:forEach>
		<input type="button" value="保存" onclick="add()">
	</form>
</body>
</html>