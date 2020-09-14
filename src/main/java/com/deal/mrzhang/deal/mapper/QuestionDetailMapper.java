package com.deal.mrzhang.deal.mapper;

import com.deal.mrzhang.deal.entity.QuestionDetail;
import com.deal.mrzhang.deal.entity.QuestionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    long countByExample(QuestionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int deleteByExample(QuestionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int insert(QuestionDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int insertSelective(QuestionDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    List<QuestionDetail> selectByExample(QuestionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    QuestionDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") QuestionDetail record, @Param("example") QuestionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") QuestionDetail record, @Param("example") QuestionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(QuestionDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QuestionDetail record);
}