<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
    Greeting : ${greeting}
    <br>
    ${info}
</body>
	<form method="post" action="http://localhost:8080/owasp/jinjection">
		<input type="text" name="info" id="info" value="${info}" />
		<button type="submit">Send</button>
	</form>
</html>