package com.jy.repository.wrapper;

import com.jy.entity.Article;
import com.jy.vo.ArticleVo;
import com.jy.vo.PageVo;

import java.util.List;

public interface ArticleWrapper {
    List<Article> listArticles(PageVo page);

    List<Article> listArticles(ArticleVo article, PageVo page);

    List<ArticleVo> listArchives();

}
