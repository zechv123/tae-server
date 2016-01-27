<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글 작성</title>
</head>
<body>
<form method="post" action="/save">
    <label>제목</label>
    <input name="title"/>
    <br>
    <label>내용</label>
    <br>
    <textarea name="content" rows="20"></textarea>
    <br>
    <input type="submit" value="저장">
</form>
</body>
</html>