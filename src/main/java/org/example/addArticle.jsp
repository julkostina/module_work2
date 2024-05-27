<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Article</title>
</head>
<body>
<h1>Add New Article</h1>
<form action="addArticle" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required><br><br>
    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea><br><br>
    <input type="submit" value="Add Article">
</form>
<a href="listArticles">Back to Articles</a>
</body>
</html>
