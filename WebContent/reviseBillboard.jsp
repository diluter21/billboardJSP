<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html lang="UTF-8">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<link rel=stylesheet type="text/css" href="addBillboard.css">
<title>新增公告</title>
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
<script src="https://cdn.ckeditor.com/4.7.3/standard/ckeditor.js"></script>

</head>


<body>



	<p>修改公告</p>







	<s:iterator var="UpdateList" value="#session.UpdateList">
		<p class="0">
			<s:property value="#UpdateList.0" />
		</p>
		<p class="1">
			<s:property value="#UpdateList.1" />
		</p>
	</s:iterator>







	<form
		action="${pageContext.request.contextPath}/revise?id=${requestScope.Updateid}"
		method="post">


		<br>
		<br>
		<p class="text">標題:</p>
		<p class="input1">
			<input type="text" name="title" placeholder=" ${UpdateList[0]} " />
		</p>
		<br>
		<br>
		<p class="text">發佈日期 :</p>
		<p class="input1">
			<input type="text" name="releaseDate" placeholder=" ${UpdateList[1]}" />
		</p>
		<br>
		<br>
		<p class="text">截止日期:</p>
		<p class="input1">
			<input type="text" name="dueDate" placeholder="${UpdateList[2]}" />
			
		</p>
		<br>
		<br>
		<p>公布內容:</p> 




		<script src="https://cdn.ckeditor.com/4.7.3/standard/ckeditor.js"></script>
		<textarea name="detail" textarea id="editor"> ${UpdateList[3]} </textarea>
		
		
    	<script>
CKEDITOR.replace('editor');
</script>
		
	



		<br>
		<br> <input type="submit" value="送出" /> <br>
		<br>
	</form>

</body>
</html>