package com.example.demo.service;

import com.example.demo.domain.Word;

public interface WordServices {

	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();
}
