package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Word;

@FeignClient("NOUN")
public interface NounClient {

	@GetMapping("/")
	public Word getWord();
}
