package com.deal.mrzhang.deal.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table second_question_type
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SecondQuestionType implements Serializable {
    /**
     * Database Column Remarks:
     *   二级问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_question_type.second_type_id
     *
     * @mbg.generated
     */
    private Integer secondTypeId;

    /**
     * Database Column Remarks:
     *   二级问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_question_type.second_type_name
     *
     * @mbg.generated
     */
    private String secondTypeName;

    /**
     * Database Column Remarks:
     *   一级问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_question_type.first_type_id
     *
     * @mbg.generated
     */
    private Integer firstTypeId;

    /**
     * Database Column Remarks:
     *   一级问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_question_type.first_type_name
     *
     * @mbg.generated
     */
    private String firstTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table second_question_type
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_question_type.second_type_id
     *
     * @return the value of second_question_type.second_type_id
     *
     * @mbg.generated
     */
    public Integer getSecondTypeId() {
        return secondTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_question_type.second_type_id
     *
     * @param secondTypeId the value for second_question_type.second_type_id
     *
     * @mbg.generated
     */
    public void setSecondTypeId(Integer secondTypeId) {
        this.secondTypeId = secondTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_question_type.second_type_name
     *
     * @return the value of second_question_type.second_type_name
     *
     * @mbg.generated
     */
    public String getSecondTypeName() {
        return secondTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_question_type.second_type_name
     *
     * @param secondTypeName the value for second_question_type.second_type_name
     *
     * @mbg.generated
     */
    public void setSecondTypeName(String secondTypeName) {
        this.secondTypeName = secondTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_question_type.first_type_id
     *
     * @return the value of second_question_type.first_type_id
     *
     * @mbg.generated
     */
    public Integer getFirstTypeId() {
        return firstTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_question_type.first_type_id
     *
     * @param firstTypeId the value for second_question_type.first_type_id
     *
     * @mbg.generated
     */
    public void setFirstTypeId(Integer firstTypeId) {
        this.firstTypeId = firstTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_question_type.first_type_name
     *
     * @return the value of second_question_type.first_type_name
     *
     * @mbg.generated
     */
    public String getFirstTypeName() {
        return firstTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_question_type.first_type_name
     *
     * @param firstTypeName the value for second_question_type.first_type_name
     *
     * @mbg.generated
     */
    public void setFirstTypeName(String firstTypeName) {
        this.firstTypeName = firstTypeName;
    }
}