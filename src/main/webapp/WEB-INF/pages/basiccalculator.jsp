<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>기초적인 계산기</title>
</head>
<body>

    <h1>덧셈과 곱셈 계산기</h1>
    <br>
    <p>가장 기본적인 덧셈과 곱셈만 가능합니다. 자연수를 입력하세요.</p>
    <br>
    <br>
    <form method = "get" action = "/basiccalculator/addition">
        <label>1번째 숫자</label>
        <input name = "int1" />
        <label> 2번째 숫자</label>
        <input name = "int2" />
        <br>
        <input type = "submit" value = "더하기">
    </form>
    <form method = "get" action = "/basiccalculator/multiplication">
        <label>1번째 숫자</label>
        <input name = "int4" />
        <label> 2번째 숫자</label>
        <input name = "int5" />
        <br>
        <input type = "submit" value = "곱하기" >
</form>
    <br>
    <p>결과값은: </p>
    ${result}

</body>
</html>
