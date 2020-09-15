package com.deal.mrzhang.deal.api;

import com.alibaba.fastjson.JSON;
import com.deal.mrzhang.deal.entity.QuestionType;
import com.deal.mrzhang.deal.service.QuestionTypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;


@RestController
public class QuestionTypeController {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    private QuestionTypeService questionTypeService;

   /* @GetMapping("/getTypes")
    @ResponseBody
    @ApiOperation("获取所有的问题类型")
    public QuestionType getAllQuestionType(Integer typeId){
        logger.info("查询所有的类型列表:"+typeId);
        QuestionType allQuestionType = questionTypeService.getAllQuestionType(typeId);
        logger.info("查看所有的类型列表:"+ JSON.toJSONString(allQuestionType));
        return allQuestionType;
    }*/

   /**
    * 处理excel文件导入的请求
    * */
   @PostMapping(value = "/excelImport")
   @ApiOperation("excel文件导入操作")
    public void  excelExport( MultipartFile file) throws IOException, ParseException {
       logger.info("输入的excel文件"+file.getOriginalFilename());
       InputStream inputStream = file.getInputStream();
       List<List<Object>> lists = ExcelUtils.readXlsxFirstSheet(inputStream);
       questionTypeService.excelExport(lists);
   }

   /**
    * 统计结果输出为excel
    * * */
   @PostMapping("/excelExport")
   @ApiOperation("excel报表导出操作")
    public void excelExport(){

   }
}
