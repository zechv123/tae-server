<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Video List! :)</title>
</head>
<body>
    <h1>라세르타 주식회사 영상 데이터베이스</h1>
    <p>원하는 영상을 등록하고, 등록된 영상을 열람 할 수 있습니다.</p>
    <a href = "/addvideos">영상 추가하기</a>
    <br><br>
    ------------------------------------------------------------------------------------<br>
    <table>
        <thread>
            <tr>
                <th>제목 </th>
                <th>| 영상번호 | </th>
                <th>추천인 | </th>
                <th>원작자 | </th>
                <th>길이 | </th>
                <th>추천성별 | </th>
                <th>추천나이 | </th>
                <th>평점 | </th>
            </tr>
        </thread>
        <tbody>
        <c:choose>
            <c:when test = "${fn:length(videoslist)==0}">
                <tr>
                    <td><br>등록된 영상이 없습니다.</td>
                    <td></td>
                </tr>
            </c:when>
            <c:otherwise>
                <c:forEach items = "${videoslist}" var = "post">
                    <tr>
                        <td>${post.title}</td>
                        <td>${post.id}</td>
                        <td>${post.recommender}</td>
                        <td>${post.creator}</td>
                        <td>${post.length}</td>
                        <td>${post.preferSex}</td>
                        <td>${post.preferAge}</td>
                        <td>미구현</td>
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