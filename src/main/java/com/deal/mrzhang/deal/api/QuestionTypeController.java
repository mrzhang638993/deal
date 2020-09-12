package com.deal.mrzhang.deal.api;

import com.alibaba.fastjson.JSON;
import com.deal.mrzhang.deal.entity.QuestionType;
import com.deal.mrzhang.deal.service.QuestionTypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
public class QuestionTypeController {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    private QuestionTypeService questionTypeService;

    @GetMapping("/getTypes")
    @ResponseBody
    @ApiOperation("获取所有的问题类型")
    public QuestionType getAllQuestionType(Integer typeId){
        logger.info("查询所有的类型列表:"+typeId);
        QuestionType allQuestionType = questionTypeService.getAllQuestionType(typeId);
        logger.info("查看所有的类型列表:"+ JSON.toJSONString(allQuestionType));
        return allQuestionType;
    }
}
