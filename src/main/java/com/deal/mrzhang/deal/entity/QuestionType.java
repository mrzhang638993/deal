package com.deal.mrzhang.deal.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table question_type
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class QuestionType implements Serializable {
    /**
     * Database Column Remarks:
     *   一级问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_type.type_id
     *
     * @mbg.generated
     */
    private Integer typeId;

    /**
     * Database Column Remarks:
     *   一级问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_type
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_type.type_id
     *
     * @return the value of question_type.type_id
     *
     * @mbg.generated
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_type.type_id
     *
     * @param typeId the value for question_type.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_type.type_name
     *
     * @return the value of question_type.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_type.type_name
     *
     * @param typeName the value for question_type.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "QuestionType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}