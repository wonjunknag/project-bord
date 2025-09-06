package com.wonjuninfo.projectbord.repository;

import com.wonjuninfo.projectbord.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
