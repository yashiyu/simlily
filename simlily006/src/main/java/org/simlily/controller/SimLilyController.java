package org.simlily.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.simlily.Output;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimLilyController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	public String index() {
		return "SimLily!";
	}
	@RequestMapping("/foo/high/mine.do")
	public String nanika() {
		return "SimLily DO FO!";
	}
	@RequestMapping("/greeting")
	public Output greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Output(counter.incrementAndGet(),
				String.format(template, name));
	}

}
