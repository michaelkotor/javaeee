<%
    String message = pageContext.getException().getMessage();
    String exception = pageContext.getException().getClass().toString();
%>

<!DOCTYPE>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exception</title>
</head>
<body>
    <jsp:include page="common/hello.jsp"/>
    <h2>Exception occurred while processing the request</h2>
    <p>Type: <%= exception%>></p>
    <p>Message: <%= message%></p>
</body>

</html>