package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/viewArticle")
public class ViewArticleServlet extends HttpServlet {
    private ArticleRepository articleRepository;

    @Override
    public void init() {
        articleRepository = new ArticleRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        Article article = articleRepository.getArticleByTitle(title);
        req.setAttribute("article", article);
        req.getRequestDispatcher("/viewArticle.jsp").forward(req, resp);
    }
}
