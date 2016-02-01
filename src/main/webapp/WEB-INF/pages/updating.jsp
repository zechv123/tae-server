<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글 수정</title>
</head>
<body>
<form method="post" action="/update">
    글번호 : ${_id} <br>
    <label>제목</label>
    <input name="title"/>
    <br>
    <label>내용</label>
    <br>
    <textarea name="content" rows="20"></textarea>
    <br>
    <button name = "id" value = "${_id}">수정하기</button>
</form>
<br><br>------------------------------------------------<br>
Hello Google App Engine!
<br>
Following Links lead to specific page! :)
<br>
<br>
/list: <a href="/list">Board Function</a>
<br>
/basiccalculator: <a href="/basiccalculator">Calculator Function</a>
<br>
/helloworld: <a href="/helloworld">HelloWorld Function</a>
<br>
/videoslist: <a href="/videoslist">Video List Function</a>
<br>------------------------------------------------<br>
</body>
</html>