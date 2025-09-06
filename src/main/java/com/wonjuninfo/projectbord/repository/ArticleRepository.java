package com.wonjuninfo.projectbord.repository;

import com.wonjuninfo.projectbord.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
