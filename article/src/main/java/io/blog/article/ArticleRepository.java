/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: microservice-communication-via-restTemplate
 */
package io.blog.article;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findArticleById(Long articleId);
}

