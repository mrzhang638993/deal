package com.deal.mrzhang.deal.mapper;

import com.deal.mrzhang.deal.entity.QuestionTypeAggr;
import com.deal.mrzhang.deal.entity.QuestionTypeAggrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeAggrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    long countByExample(QuestionTypeAggrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int deleteByExample(QuestionTypeAggrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int insert(QuestionTypeAggr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int insertSelective(QuestionTypeAggr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    List<QuestionTypeAggr> selectByExample(QuestionTypeAggrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    QuestionTypeAggr selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") QuestionTypeAggr record, @Param("example") QuestionTypeAggrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") QuestionTypeAggr record, @Param("example") QuestionTypeAggrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(QuestionTypeAggr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QuestionTypeAggr record);
}