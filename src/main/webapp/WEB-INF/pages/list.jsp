<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>글 목록</title>
</head>
<body>
<table>
    <a href="/write">글 작성</a>
    <br>
    <thread>
        <tr>
            <th>글 번호</th>
            <th>제목</th>
        </tr>
    </thread>
    <tbody>
    <c:choose>
        <c:when test="${fn:length(postList)==0}">
            <tr>
                <td></td>
                <td>등록된 글이 없습니다.</td>
            </tr>
        </c:when>
        <c:otherwise>
            <c:forEach items = "${postList}" var = "post">
                <tr>
                    <td>${post.id}</td>
                    <td>${post.title}</td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    </tbody>
</table>
<br><br>-----------------------------------------------<br>
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
<br>-----------------------------------------------<br>
</body>
</html>