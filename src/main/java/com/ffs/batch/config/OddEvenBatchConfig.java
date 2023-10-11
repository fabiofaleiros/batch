package com.ffs.batch.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
public class OddEvenBatchConfig {
	
//	@Autowired
//	private PlatformTransactionManager transactionManager;
//	
//	@Autowired
//	private JobRepository jobRepository;
//	
//	@Bean
//	@Qualifier("printOddEvenJob")
//	Job printOddEvenJob(@Qualifier("printOddEvenStep") Step step) {
//		return new JobBuilder("printOddEvenJob", jobRepository)
//				.start(step)
//				.incrementer(new RunIdIncrementer())
//				.build();
//	}
//	
//	@Bean
//	Step printOddEvenStep() {
////	Step printOddEvenStep(ItemReader<Integer> reader, ItemProcessor<Integer, String> processor, ItemWriter<String> writer) {		
//		return new StepBuilder("printOddEvenStep", jobRepository)
//				.<Integer, String>chunk(1, transactionManager)
//				.reader(countUntilTenReader())
//				.processor(oddEvenProcessor())
//				.writer(printWrite())
//				.build();
//	}
//	
//	IteratorItemReader<Integer> countUntilTenReader(){
//		
//		List<Integer> numbersOneToTen = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		return new IteratorItemReader<Integer>(numbersOneToTen);
//	}
//	
//	FunctionItemProcessor<Integer, String> oddEvenProcessor(){
//		return new FunctionItemProcessor<Integer, String>
//				(item -> item % 2 == 0 ? String.format("Even item: %s", item) : String.format("Odd item: %s", item));
//	}
//	
//	ItemWriter<String> printWrite(){
//		return itens -> itens.forEach(System.out::println);
//	}

}
