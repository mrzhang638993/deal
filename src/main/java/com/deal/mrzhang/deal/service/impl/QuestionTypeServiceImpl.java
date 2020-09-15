package com.deal.mrzhang.deal.service.impl;

import com.alibaba.fastjson.JSON;
import com.deal.mrzhang.deal.api.DateUtils;
import com.deal.mrzhang.deal.entity.*;
import com.deal.mrzhang.deal.mapper.QuestionTypeMapper;
import com.deal.mrzhang.deal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {

    @Autowired
    private QuestionTypeMapper questionTypeMapper;
    @Autowired
    private FirstQuestionTypeService firstQuestionTypeService;
    @Autowired
    private SecondQuestionTypeService secondQuestionTypeService;
    @Autowired
    private ThridQuestionTypeService thridQuestionTypeService;
    @Autowired
    private QuestionDetailService questionDetailService;

    @Override
    public QuestionType getAllQuestionType(Integer typeId) {
        QuestionType questionType = questionTypeMapper.selectByPrimaryKey(typeId);
        return questionType;
    }

    @Override
    @Transactional
    public void excelExport(List<List<Object>> lists) throws ParseException {
        // 解析数据成为po对象
        List<QuestionDetail> questionDetails = new ArrayList<>();
        List<QuestionType> questionTypes = new ArrayList<>();
        List<FirstQuestionType> firstQuestionTypes = new ArrayList<>();
        List<SecondQuestionType> secondQuestionTypes = new ArrayList<>();
        List<ThridQuestionType> thridQuestionTypes = new ArrayList<>();
        toPo(lists, questionTypes, firstQuestionTypes, secondQuestionTypes, thridQuestionTypes, questionDetails);
        dealWithQuestionType(questionTypes);
        dealWithFirstQuestionType(firstQuestionTypes);
        dealWithSecondQuestionType(secondQuestionTypes);
        dealWithThridQuestionType(thridQuestionTypes);
        dealWithQuestionDetail(questionDetails);
    }

    /**
     * 处理问题的详情信息
     */
    @Transactional
    public void dealWithQuestionDetail(List<QuestionDetail> questionDetails) {
        questionDetailService.dealWithQuestionDetail(questionDetails);
    }

    /**
     * 处理问题的三级类型
     */
    @Transactional
    public void dealWithThridQuestionType(List<ThridQuestionType> thridQuestionTypes) {
    }


    /**
     * 处理问题的二级类型
     */
    @Transactional
    public void dealWithSecondQuestionType(List<SecondQuestionType> secondQuestionTypes) {
    }

    /**
     * 处理问题的以及类型
     */
    @Transactional
    public void dealWithFirstQuestionType(List<FirstQuestionType> firstQuestionTypes) {
    }

    /**
     * 处理问题类型的操作
     */
    @Transactional
    public void dealWithQuestionType(List<QuestionType> questionTypes) {
    }

    /**
     * 进行数据转换操作，转换成为对应的po
     */
    private void toPo(List<List<Object>> lists, List<QuestionType> questionTypes,
                      List<FirstQuestionType> firstQuestionTypes,
                      List<SecondQuestionType> secondQuestionTypes,
                      List<ThridQuestionType> thridQuestionTypes,
                      List<QuestionDetail> questionDetails) throws ParseException {
        for (List<Object> list : lists) {
            constructPo(list, questionTypes, firstQuestionTypes, secondQuestionTypes, thridQuestionTypes, questionDetails);
        }
    }

    /**
     * 构建单个的对象的数据
     * 王丽博	/	在家	/	钉钉	课堂问题	设备问题_课堂	主机、系统_课堂	系统卡顿优化	电脑卡主	重启电脑	高术望	2020/9/1	16:20
     */
    private void constructPo(List<Object> data, List<QuestionType> questionTypes, List<FirstQuestionType> firstQuestionTypes, List<SecondQuestionType> secondQuestionTypes, List<ThridQuestionType> thridQuestionTypes, List<QuestionDetail> questionDetails) throws ParseException {
        //QuestionType questionType=new QuestionType();
        //questionType.setTypeName((String) data.get(5));
        // 处理问题一级类型
        //FirstQuestionType firstQuestionType=new FirstQuestionType();
        //firstQuestionType.setTypeName();
        QuestionDetail questionDetail = new QuestionDetail();
        questionDetail.setCreator((String) data.get(0));
        questionDetail.setClassId((String) (data.get(1) == null ? "" : data.get(1)));
        questionDetail.setLocation((String) data.get(2));
        questionDetail.setLiveRoom((String) data.get(3));
        //questionDetail.setSourceId();
        questionDetail.setSourceName((String) data.get(4));
        //questionDetail.setTypeId();
        questionDetail.setTypeName((String) data.get(5));
        questionDetail.setFirstTypeName((String) data.get(6));
        questionDetail.setSecondTypeName((String) data.get(7));
        questionDetail.setThridTypeName((String) data.get(8));
        questionDetail.setDescs((String) data.get(9));
        questionDetail.setSolution((String) data.get(10));
        questionDetail.setResolvor((String) data.get(11));
        // 设置创建时间
        Object o = data.get(12);
        if (o instanceof String) {
            StringBuilder sb = new StringBuilder();
            String createDate = (String) data.get(12);
            if (createDate.contains(".")) {
                //2020.8.24
                String[] split = createDate.split("\\.");
                sb.append(split[0]).append("-").append(split[1]).append("-").append(split[2]);
                questionDetail.setCreateDate(DateUtils.getDateFromStr(sb.toString()));
            } else if (!createDate.equals("31-十二月-1899")){
                String[] split = createDate.split("-");
                if (!(split.length == 1 && split[0].equals(""))) {
                    System.out.println(JSON.toJSON(split));
                    sb.append(split[2]);
                    switch (split[1]) {
                        case "十二":
                            sb.append("-12-");
                            break;
                        case "十一":
                            sb.append("-11-");
                            break;
                        case "十":
                            sb.append("-10-");
                            break;
                        case "九月":
                            sb.append("-09-");
                            break;
                        case "八月":
                            sb.append("-08-");
                            break;
                        case "七月":
                            sb.append("-07-");
                            break;
                        case "六月":
                            sb.append("-06-");
                            break;
                        case "五月":
                            sb.append("-06-");
                            break;
                        case "四月":
                            sb.append("-04-");
                            break;
                        case "三月":
                            sb.append("-03-");
                            break;
                        case "二月":
                            sb.append("-02-");
                            break;
                        case "一月":
                            sb.append("-01-");
                            break;
                    }
                    sb.append(split[0]);
                    questionDetail.setCreateDate(DateUtils.getDateFromStr(sb.toString()));
                }else if (o instanceof Date) {
                    questionDetail.setCreateDate(DateUtils.transFormate((Date) o));
                }
            }
        }else if (o instanceof Date){
            questionDetail.setCreateDate((Date) o);
        }
        Object o1 = data.get(13);
        if (o1 instanceof Date) {
            questionDetail.setCreateTime(DateUtils.getSting((Date) data.get(13)));
        } else if (o1 instanceof String) {
            System.out.println(o1);
            if (!((String) o1).equals("31-十二月-1899") && o1 != null && !o1.equals("")) {
                if (!((String) o1).contains("-")) {
                    questionDetail.setCreateTime((String) data.get(13));
                }
            }
        }
        //String  createTime = (String) data.get(13);
        //String s1 = createTime.replaceAll("：",":");
        /*if (o instanceof  Date){
            questionDetail.setCreateTime(DateUtils.getSting((Date) data.get(13)));
        }else {
            questionDetail.setCreateTime((String) data.get(13));
        }*/
        //questionDetail.setCreateTime(s1);
        questionDetails.add(questionDetail);
    }
}
