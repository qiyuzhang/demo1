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
	function page(pageNum) {
		$("#p").val(pageNum);
		$("[name='f']").submit();
	}
	
	function delAll() {
		var ids = "";
		$("[name='sid']:checked").each(function() {
			ids+=","+this.value;
		})
		
		ids=ids.substring(1);
		
		
		$.ajax({
			url:"delAll.do",
			data:"ids="+ids,
			type:"post",
			dataType:"json",
			success: function(data) {
				if(data>0){
					alert("删除成功");
					location.href="list.do";
				}

				else{
					alert("删除失败");
					
				}
			}
			
		})
	}
</script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<table>
		<tr>
			<td>
				<form action="list.do" method="post" name="f">
					<input type="hidden" name="pageNum" id="p">
					店铺名称: <input type="text" name="sname" value="${slike }">
					商品名称: <input type="text" name="gname" value="${glike }">
					<input type="submit" value="查询">
				</form>
			</td>
			
			<td>
				<input type="button" value="添加" onclick="location.href='selGoodsList.do'">
			</td>
			<td>
				<input type="button" value="批删" onclick="delAll()">
			</td>
		</tr>
		
		<tr>
			<td>
				<input type="checkbox">
			</td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${list }" var="l">
			<tr>
				<td>
					<input type="checkbox" name="sid" value="${l.sid }">
				</td>
				<td>${l.sid }</td>
				<td>${l.sname }</td>
				<td>${l.sdate }</td>
				<td>${l.gname }</td>
				<td>
					<input type="button" value="查看详情" onclick="location.href='selOne.do?sid=${l.sid}'">
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="10">
				<input type="button" value="首页" onclick="page(${p.firstPage})">
				<input type="button" value="上一页" onclick="page(${p.prePage==0?1:p.prePage})">
				当前${p.pageNum }页/${p.pages==0?1:p.pages }页/总条数${p.total }
				<input type="button" value="下一页" onclick="page(${p.nextPage==0?p.lastPage:p.nextPage})">
				<input type="button" value="尾页" onclick="page(${p.lastPage})">
			</td>
		</tr>
	</table>
</body>
</html>