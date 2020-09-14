package com.deal.mrzhang.deal.service;

import com.deal.mrzhang.deal.entity.QuestionType;

import java.text.ParseException;
import java.util.List;

public interface QuestionTypeService {
    QuestionType getAllQuestionType(Integer typeId);

    void excelExport(List<List<Object>> lists) throws ParseException;
}
