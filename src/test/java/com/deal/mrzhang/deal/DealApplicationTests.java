package com.deal.mrzhang.deal;

import com.deal.mrzhang.deal.entity.QuestionType;
import com.deal.mrzhang.deal.mapper.QuestionTypeMapper;
import com.deal.mrzhang.deal.service.QuestionTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DealApplicationTests {

	@Autowired
	private QuestionTypeService questionTypeService;
	@Test
	public void contextLoads() {
	}


	@Test
	public void testVoid(){
		QuestionType allQuestionType = questionTypeService.getAllQuestionType(1);
		System.out.println(allQuestionType);
	}
}
