package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Image;

@RestController
public class ImageController {

	
	@RequestMapping("/images")
	public List<Image> getImages(){
		List<Image> list = Arrays.asList(new Image(1L,"hello image 1","https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.hello.com%2Fimg_%2Fhellowithwaves.png&imgrefurl=https%3A%2F%2Fhello.com%2F&docid=H3Qc_sTd580hmM&tbnid=teqP5ptslqk2yM%3A&vet=10ahUKEwjK1bbf5dTkAhV8ILcAHU6xAWAQMwh4KAAwAA..i&w=1000&h=1000&bih=677&biw=1600&q=hello%20images&ved=0ahUKEwjK1bbf5dTkAhV8ILcAHU6xAWAQMwh4KAAwAA&iact=mrc&uact=8"),
				new Image(2L,"hello image 2","https://www.google.com/imgres?imgurl=https%3A%2F%2Fimg1.sendscraps.com%2Fse%2F031%2F001.gif&imgrefurl=https%3A%2F%2Fwww.sendscraps.com%2Fhello.html&docid=dh3YfJXDf_BFUM&tbnid=eVeVrtirZHZRJM%3A&vet=10ahUKEwjK1bbf5dTkAhV8ILcAHU6xAWAQMwh9KAUwBQ..i&w=400&h=279&bih=677&biw=1600&q=hello%20images&ved=0ahUKEwjK1bbf5dTkAhV8ILcAHU6xAWAQMwh9KAUwBQ&iact=mrc&uact=8"),
				new Image(3L,"hello image 3","https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.unsplash.com%2Fphoto-1500576992153-0271099def59%3Fixlib%3Drb-1.2.1%26ixid%3DeyJhcHBfaWQiOjEyMDd9%26w%3D1000%26q%3D80&imgrefurl=https%3A%2F%2Funsplash.com%2Fsearch%2Fphotos%2Fhello&docid=3a4WIumTeZFajM&tbnid=1xyvMZt_W-i5uM%3A&vet=10ahUKEwjK1bbf5dTkAhV8ILcAHU6xAWAQMwh-KAYwBg..i&w=1000&h=668&bih=677&biw=1600&q=hello%20images&ved=0ahUKEwjK1bbf5dTkAhV8ILcAHU6xAWAQMwh-KAYwBg&iact=mrc&uact=8"));
		return list;
	}
}
