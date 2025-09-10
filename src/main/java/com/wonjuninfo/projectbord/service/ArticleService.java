package com.wonjuninfo.projectbord.service;

import com.wonjuninfo.projectbord.domain.type.SearchType;
import com.wonjuninfo.projectbord.dto.ArticleDto;
import com.wonjuninfo.projectbord.dto.ArticleUpdateDto;
import com.wonjuninfo.projectbord.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> serchArticles(SearchType searchType, String searchKeyword) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto serchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {

    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {

    }

    public void deleteArticle(long articleId) {

    }
}
