package com.deal.mrzhang.deal.service.impl;

import com.deal.mrzhang.deal.entity.QuestionDetail;
import com.deal.mrzhang.deal.mapper.QuestionDetailMapper;
import com.deal.mrzhang.deal.service.QuestionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionDetailServiceImpl implements QuestionDetailService {

    @Autowired
    private QuestionDetailMapper questionDetailMapper;
    @Override
    public void dealWithQuestionDetail(List<QuestionDetail> questionDetails) {
        questionDetails.forEach(item->{
            questionDetailMapper.insert(item);
        });

    }
}
