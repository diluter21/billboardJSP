<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html lang="UTF-8">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<link rel=stylesheet type="text/css" href="home.css">
<title>布告欄</title>
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="home.js"></script>


</head>

<body>
	<p>瀏覽公布事項</p>


	<p class="title">標題</p>
	<p class="releaseDate">開始日期</p>
	<p class="dueDate">結束日期</p>
	<p class="revise">修改</p>
	<p class="delete">刪除</p>






<!--  呼叫全部的List${billboardList}-->




<div>







		<s:iterator var="billboard" value="#session.billboard">
		<p class="title">
			<s:property value="#billboard.title" />
		</p>
		<p class="releaseDate">
			<s:property value="#billboard.releaseDate" />
		</p>
		<p class="dueDate">
			<s:property value="#billboard.dueDate" />
		</p>
		<p class="revise">
			<a
				href="${pageContext.request.contextPath}/revisePage?updateid=<s:property value="#billboard.Id"/>">修改</a>
		</p>
		<p class="delete">
			<a
				href="${pageContext.request.contextPath }/deleteDillboardById?id=<s:property value="#billboard.Id"/>">刪除</a>
		</p>
	</s:iterator>
	</div>


	<div id="billboardDiv"></div>


	<div align="center">
		<div class="btn-group">
			<button type="button" onclick="clickEvent()" class="btn btn-primary">新增</button>
		</div>

		<div align="center">
		<div> 總共有${allPage}頁,   當前是第${offset}頁</div>
	     <a href="goHomePage.action?curPageNumber=0">首页</a>
        <a href="goHomePage.action?curPageNumber=${curPageNumber-1}">上一頁</a>
        <a href="goHomePage.action?curPageNumber=${curPageNumber+1}">下一頁</a>
        <a href="goHomePage.action?curPageNumber=${allPage-1}">尾頁</a>
      
      </div>
		


		
</body>







</html>


