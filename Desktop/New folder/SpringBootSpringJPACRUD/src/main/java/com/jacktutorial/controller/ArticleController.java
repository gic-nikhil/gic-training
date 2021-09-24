package com.jacktutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.tools.javac.util.List;

import jacktutorial.serviceImpl.ArticleService;

@Controller
@RequestMapping(value="/article")

public class ArticleController {
	
	@Autowired
	ArticleService articleservice;
	
	@RequestMapping(value="/list" , method=RequestMethod.GET)
	public ModelAndView list() {
ModelAndView model = new ModelAndView("article_list");
List articleList = articleservice.getAllArticles();
model.addObject("articleList", articleList);

return model;
	}
	
@RequestMapping(value="/addArticle" , method=RequestMethod.GET)
public ModelAndView addArticle() {
ModelAndView model = new ModelAndView();

Article article = new Article();
model.addObject("articleform", article);
model.setViewName("articleform");

return model;
}
@RequestMapping(value="/updateArticle/{id}" , method=RequestMethod.GET)
public ModelAndView editArticle(@PathVariable long id) {
ModelAndView model = new ModelAndView();

Article article = articleservice.getArticleById(id);
model.addObject("articleform", article);
model.setViewName("articleform");

return model;
}
@RequestMapping(value="/saveArticle/" , method=RequestMethod.GET)
public ModelAndView save(@ModelAttribute("articleForm") Article article) {
articleservice.saveorUpdate(article);
return new ModelAndView("redirect:article/list");
}
@RequestMapping(value="/deleteArticle/" , method=RequestMethod.GET)
public ModelAndView delete(@PathVariable("id") long id) {
articleservice.deleteArticle(id);
return new ModelAndView("redirect:article/list");
}
}