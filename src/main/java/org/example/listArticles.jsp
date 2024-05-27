<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article List</title>
</head>
<body>
<h1>Articles</h1>
<ul>
    <c:forEach var="article" items="${articles}">
        <li>
            <a href="viewArticle?title=${article.title}">${article.title}</a>
        </li>
    </c:forEach>
</ul>
<a href="addArticle.jsp">Add New Article</a>
</body>
</html>
