<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<table>
		<tr>
			<td>电影编号</td>
			<td>电影名称</td>
			<td>电影价格</td>
			<td>拍摄时间</td>
			<td>电影时长</td>
			<td>电影类型</td>
			<td>电影导演</td>
			<td>上映时间</td>
			<td>上映地区</td>
			<td>电影状态</td>
		</tr>
		
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.mid }</td>
				<td>${l.mname }</td>
				<td>${l.price }</td>
				<td>${l.datea }</td>
				<td>${l.hours }</td>
				<td>${l.type }</td>
				<td>${l.dname }</td>
				<td>${l.year }</td>
				<td>${l.area }</td>
				<td>
					<c:if test="${l.status==1 }">正在上映</c:if>
					<c:if test="${l.status==0 }">还未上映</c:if>
					<c:if test="${l.status==2 }">正在热映</c:if>
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td>
				<a href="list.do?pageNum=${p.firstPage }">首页</a>
				<a href="list.do?pageNum=${p.prePage==0?1:p.prePage }">上一页</a>
				当前${p.pageNum }页/${p.pages }页总条数${p.total }
				<a href="list.do?pageNum=${p.nextPage==0?p.lastPage:p.nextPage }">下一页</a>
				<a href="list.do?pageNum=${p.lastPage }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>