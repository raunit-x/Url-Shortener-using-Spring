<%@ page import="com.rauniturlproject.urlminiprojectmaven.Url" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>MongoDB Urls</title>
    <link rel="stylesheet" type="text/css" href="homeCSS.css">
    <link href="https://fonts.googleapis.com/css2?family=Lato&family=Monoton&family=Press+Start+2P&display=swap"
          rel="stylesheet">
</head>
<body>
<h1 class="heading">MongoDB Database</h1>
<div class="upperButton">
    <form action="home">
        <input type="submit" value="Back To Home">
    </form>
</div>
<h2>Database Size = ${urlsDb.size()}</h2>
<ol>
    <c:if test="${not empty urlsDb}">
        <c:forEach items="${urlsDb}" var="url">
            <li class="entry">
                <pre>
{
    ID: <span class="value">${url.id}</span>,
    URL: <span class="value">${url.urlString}</span>
}
                </pre>
            </li>

        </c:forEach>
    </c:if>
</ol>
</body>
</html>
