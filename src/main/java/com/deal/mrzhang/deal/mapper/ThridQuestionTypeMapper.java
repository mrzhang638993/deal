package com.deal.mrzhang.deal.mapper;

import com.deal.mrzhang.deal.entity.ThridQuestionType;
import com.deal.mrzhang.deal.entity.ThridQuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThridQuestionTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    long countByExample(ThridQuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int deleteByExample(ThridQuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer questionTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int insert(ThridQuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int insertSelective(ThridQuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    List<ThridQuestionType> selectByExample(ThridQuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    ThridQuestionType selectByPrimaryKey(Integer questionTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ThridQuestionType record, @Param("example") ThridQuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ThridQuestionType record, @Param("example") ThridQuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ThridQuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thrid_question_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThridQuestionType record);
}