package jacktutorial.service;

import com.sun.tools.javac.util.List;

public interface Articleservice {
	
	public List getAllArticles();
	
	public Article getArticleById(long id);
	
	public void saveOrupdate(Article article);
	
	public void deleteArticle(long id);

}
