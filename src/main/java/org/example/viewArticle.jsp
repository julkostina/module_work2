<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${article.title}</title>
</head>
<body>
<h1>${article.title}</h1>
<p>${article.content}</p>
<p>Published on: ${article.publicationDate}</p>
<a href="listArticles">Back to Articles</a>
</body>
</html>
