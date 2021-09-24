package jacktutorial.serviceImpl;

import com.jacktutorial.controller.Article;
import com.sun.tools.javac.util.List;

public interface ArticleService {

	List getAllArticles1();

	List getAllArticles2();

	List getAllArticles();

	Article getArticleById(long id);

	void saveorUpdate(Article article);

	void deleteArticle(long id);

}
