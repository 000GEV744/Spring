package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdjectiveClient;
import com.example.demo.dao.ArticleClient;
import com.example.demo.dao.NounClient;
import com.example.demo.dao.SubjectClient;
import com.example.demo.dao.VerbClient;
import com.example.demo.domain.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServicesImpl implements WordServices {

	@Autowired SubjectClient subjectClient;
	@Autowired VerbClient verbClient;
	@Autowired ArticleClient articleClient;
	@Autowired NounClient nounClient;
	@Autowired AdjectiveClient adjectiveClient;
	
	
	
	@Override
	@HystrixCommand(fallbackMethod = "getSubjectFallback")
	public Word getSubject() {
		return subjectClient.getWord();
	}

	@Override
	public Word getVerb() {
		
		return verbClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getArticleFallback")
	public Word getArticle() {
		// TODO Auto-generated method stub
		return articleClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getAdjectiveFallback")
	public Word getAdjective() {
		// TODO Auto-generated method stub
		return adjectiveClient.getWord();
	}

	@Override
	public Word getNoun() {
		// TODO Auto-generated method stub
		return nounClient.getWord();
	}
	
	public Word getAdjectiveFallback() {
		return new Word("awesome");
	}
	
	public Word getArticleFallback() {
		return new Word("a");
	}
	
	public Word getSubjectFallback() {
		return new Word("someone");
	}
	
	

}
