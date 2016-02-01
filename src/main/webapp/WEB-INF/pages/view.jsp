<%@ page language ="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${title}</title>
</head>
</html>

<body>
글 번호 : ${_id} <br>
제 목 : ${title} <br>
내용 : ${content} <br>

<form action = "/delete" method = "post">
    <button name = "id" value = "${_id}" >삭제</button>
</form>
<form action = "/updating/${_id}" method = "post">
    <button name = "id" value = "${_id}" >수정</button>
</form>
</body>