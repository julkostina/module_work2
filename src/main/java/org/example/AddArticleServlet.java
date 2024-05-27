package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet("/addArticle")
public class AddArticleServlet extends HttpServlet {
    private ArticleRepository articleRepository;

    @Override
    public void init() {
        articleRepository = new ArticleRepository();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        Date publicationDate = new Date();
        Article article = new Article(title, content, publicationDate);
        articleRepository.addArticle(article);
        resp.sendRedirect("listArticles");
    }
}
