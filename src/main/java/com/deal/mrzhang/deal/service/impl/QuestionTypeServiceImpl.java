package com.deal.mrzhang.deal.service.impl;

import com.deal.mrzhang.deal.entity.QuestionType;
import com.deal.mrzhang.deal.mapper.QuestionTypeMapper;
import com.deal.mrzhang.deal.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeServiceImpl  implements QuestionTypeService {

    @Autowired
    private QuestionTypeMapper questionTypeMapper;
    @Override
    public QuestionType getAllQuestionType(Integer typeId) {
        QuestionType questionType = questionTypeMapper.selectByPrimaryKey(typeId);
        return questionType;
    }
}
