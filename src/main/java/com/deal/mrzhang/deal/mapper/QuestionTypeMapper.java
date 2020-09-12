package com.deal.mrzhang.deal.mapper;

import com.deal.mrzhang.deal.entity.QuestionType;
import com.deal.mrzhang.deal.entity.QuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    long countByExample(QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int deleteByExample(QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int insert(QuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int insertSelective(QuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    List<QuestionType> selectByExample(QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    QuestionType selectByPrimaryKey(Integer typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") QuestionType record, @Param("example") QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") QuestionType record, @Param("example") QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(QuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QuestionType record);
}