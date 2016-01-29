<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Video Info! :)</title>
</head>
<body>
    <h1>라세르타 영상 열람</h1>
    <p>개별 영상 정보 입니다.</p><br>
    <a href="/videoslist">돌아가기</a><br>
    ------------------------------------------------------------------------------------<br>
    <br>
    <table>
        <thread>
            <tr>
                <th>  영상번호 | </th>
                <th>제목 | </th>
                <th>추천인 | </th>
                <th>원작자 | </th>
                <th>길이 (초) | </th>
                <th>조회수 (만) | </th>
                <th>추천성별 | </th>
                <th>추천나이 | </th>
                <th>영상주소 | </th>
                <th>상세설명 | </th>
            </tr>
        </thread>
        <c:choose>
            <c:when test = "${fn:length(videoinfo)>0}">
            <c:forEach items = "${videoinfo}" var ="post">
                <tr>
                    <td>${post.id}</td>
                    <td>${post.title}</td>
                    <td>${post.recommender}</td>
                    <td>${post.creator}</td>
                    <td>${post.length}</td>
                    <td>${post.youtubeTotalViews}</td>
                    <td>${post.preferSex}</td>
                    <td>${post.preferAge}</td>
                    <td>${post.url}</td>
                    <td>${post.description}</td>
                </tr>
            </c:forEach>
            </c:when>
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