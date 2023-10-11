package com.ffs.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {
	
	@Autowired
	private JobRepository jobRepository;
	
	@Bean
	Job helloWorldJob(Step helloWorldStep) {
		return new JobBuilder("helloWorldJob", jobRepository)
				.start(helloWorldStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}
	
}
