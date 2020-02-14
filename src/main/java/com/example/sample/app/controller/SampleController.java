package com.example.sample.app.controller;

import com.example.sample.app.domain.model.ButtonList;
import com.example.sample.app.util.CsvUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleController {

	@GetMapping
	public String hello() {
		return "Hello, World\n";
	}

	@GetMapping
	@RequestMapping(value ="*.csv",
			produces = MediaType.APPLICATION_OCTET_STREAM_VALUE + "; charset=UTF-8; Content-Disposition: attachment")
	public Object csv() throws JsonProcessingException {
		List<ButtonList> buttonLists = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			buttonLists.add(new ButtonList(i, "package" + i, "class" + i, "method" + i));
		}
		return CsvUtil.toString(buttonLists, ButtonList.class);
	}
}
