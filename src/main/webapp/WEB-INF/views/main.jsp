<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
</head>
<body>
	<h2>메인 화면</h2>
	<%
	if (session.getAttribute("member") == null) {
	%>
	<a href="/login">로그인</a>
	<a href="/signup">회원가입</a>
	<%
	} else {
	%>
	<a href="/logout">로그아웃</a>
	<a href="/board">게시판</a>
	<%
	}
	%>
</body>
</html>