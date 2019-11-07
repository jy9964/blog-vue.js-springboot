package com.jy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jy.entity.Article;
import com.jy.entity.Comment;

/**
 * @author jy
 * <p>
 * 2019年11月8日
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByArticleAndLevelOrderByCreateDateDesc(Article a, String level);


}
