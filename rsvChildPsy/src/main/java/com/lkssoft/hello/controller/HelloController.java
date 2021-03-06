package com.lkssoft.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lkssoft.hello.service.HelloService;
import com.lkssoft.hello.vo.Article;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private HelloService helloService;	
	
	@GetMapping("{articleId}")
	@ResponseBody
	public Article viewDetail(@PathVariable String articleId) {
		Article article = this.helloService.viewArticleDetail(articleId);
		return article;
	}
	
	@PostMapping("/write")
	@ResponseBody
	public Article write(@RequestBody Article article) {
		Article a = article;
		return a;
	}
}
