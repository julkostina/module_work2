package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.ArticleRepository;

import java.io.IOException;

@WebServlet("/listArticles")
public class ListArticlesServlet extends HttpServlet {
    private ArticleRepository articleRepository;

    @Override
    public void init() {
        articleRepository = new ArticleRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("articles", articleRepository.getAllArticles());
        req.getRequestDispatcher("/listArticles.jsp").forward(req, resp);
    }
}
