package jacktutorial.repository;

import org.springframework.data.repository.CrudRepository;

import jacktutorial.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}
