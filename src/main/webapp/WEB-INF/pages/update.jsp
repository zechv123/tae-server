<%@ page language ="java" contentType="text/html; charset = UTF-8" %>
<html>
<head>
    <title>글 수정</title>
</head>
</html>

<body>
글을 수정합니다. <br>

<form method = "post" action = "/updating"

글 번호 : ${_id} <br>
제 목 : ${title} <br>
내용 : ${content} <br>

<form action = "/delete" method = "post">
    <button name = "id" value = "${_id}" >삭제</button>
</form>
<form action = "/update/${_id}">
    <button name = "id" value = "${_id}" >수정</button>
</form>
</body>