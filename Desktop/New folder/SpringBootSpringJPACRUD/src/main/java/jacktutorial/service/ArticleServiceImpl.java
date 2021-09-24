package jacktutorial.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.javac.util.List;

import jacktutorial.serviceImpl.ArticleService;

@Service
@Transactional

public class ArticleServiceImpl implements Articleservice {
	
	@Autowired
	ArticelRepository articleRepository;

	@Override
	public List getAllArticles() {
		return articleRepository.findAll();
		
	}

	@Override
	public Article getArticleById(long id) {
		// TODO Auto-generated method stub
		return ( (Article) articleRepository.findById(id)).get();
	}

	@Override
	public void saveOrupdate(Article article) {
		// TODO Auto-generated method stub
		articleRepository.save(article);
	}

	@Override
	public void deleteArticle(long id) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(id);
	}
}

