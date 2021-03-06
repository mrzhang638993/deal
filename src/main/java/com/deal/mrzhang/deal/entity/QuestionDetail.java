package com.deal.mrzhang.deal.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table question_detail
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class QuestionDetail implements Serializable {
    /**
     * Database Column Remarks:
     *   问题详情信息id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   问题描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.descs
     *
     * @mbg.generated
     */
    private String descs;

    /**
     * Database Column Remarks:
     *   问题解决方案
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.solution
     *
     * @mbg.generated
     */
    private String solution;

    /**
     * Database Column Remarks:
     *   创建日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     * Database Column Remarks:
     *   问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.type_id
     *
     * @mbg.generated
     */
    private Integer typeId;

    /**
     * Database Column Remarks:
     *   问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     * Database Column Remarks:
     *   一级问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.first_type_id
     *
     * @mbg.generated
     */
    private Integer firstTypeId;

    /**
     * Database Column Remarks:
     *   一级问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.first_type_name
     *
     * @mbg.generated
     */
    private String firstTypeName;

    /**
     * Database Column Remarks:
     *   二级问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.second_type_id
     *
     * @mbg.generated
     */
    private Integer secondTypeId;

    /**
     * Database Column Remarks:
     *   二级问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.second_type_name
     *
     * @mbg.generated
     */
    private String secondTypeName;

    /**
     * Database Column Remarks:
     *   三级问题类型id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.thrid_type_id
     *
     * @mbg.generated
     */
    private Integer thridTypeId;

    /**
     * Database Column Remarks:
     *   三级问题类型名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.thrid_type_name
     *
     * @mbg.generated
     */
    private String thridTypeName;

    /**
     * Database Column Remarks:
     *   问题来源id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.source_id
     *
     * @mbg.generated
     */
    private Integer sourceId;

    /**
     * Database Column Remarks:
     *   问题来源名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.source_name
     *
     * @mbg.generated
     */
    private String sourceName;

    /**
     * Database Column Remarks:
     *   问题创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.creator
     *
     * @mbg.generated
     */
    private String creator;

    /**
     * Database Column Remarks:
     *   问题对应的课堂编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.class_id
     *
     * @mbg.generated
     */
    private String classId;

    /**
     * Database Column Remarks:
     *   在家/在直播间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.location
     *
     * @mbg.generated
     */
    private String location;

    /**
     * Database Column Remarks:
     *   直播间id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.live_room
     *
     * @mbg.generated
     */
    private String liveRoom;

    /**
     * Database Column Remarks:
     *   问题解决人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_detail.resolvor
     *
     * @mbg.generated
     */
    private String resolvor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_detail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.id
     *
     * @return the value of question_detail.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.id
     *
     * @param id the value for question_detail.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.descs
     *
     * @return the value of question_detail.descs
     *
     * @mbg.generated
     */
    public String getDescs() {
        return descs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.descs
     *
     * @param descs the value for question_detail.descs
     *
     * @mbg.generated
     */
    public void setDescs(String descs) {
        this.descs = descs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.solution
     *
     * @return the value of question_detail.solution
     *
     * @mbg.generated
     */
    public String getSolution() {
        return solution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.solution
     *
     * @param solution the value for question_detail.solution
     *
     * @mbg.generated
     */
    public void setSolution(String solution) {
        this.solution = solution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.create_date
     *
     * @return the value of question_detail.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.create_date
     *
     * @param createDate the value for question_detail.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.create_time
     *
     * @return the value of question_detail.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.create_time
     *
     * @param createTime the value for question_detail.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.type_id
     *
     * @return the value of question_detail.type_id
     *
     * @mbg.generated
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.type_id
     *
     * @param typeId the value for question_detail.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.type_name
     *
     * @return the value of question_detail.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.type_name
     *
     * @param typeName the value for question_detail.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.first_type_id
     *
     * @return the value of question_detail.first_type_id
     *
     * @mbg.generated
     */
    public Integer getFirstTypeId() {
        return firstTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.first_type_id
     *
     * @param firstTypeId the value for question_detail.first_type_id
     *
     * @mbg.generated
     */
    public void setFirstTypeId(Integer firstTypeId) {
        this.firstTypeId = firstTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.first_type_name
     *
     * @return the value of question_detail.first_type_name
     *
     * @mbg.generated
     */
    public String getFirstTypeName() {
        return firstTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.first_type_name
     *
     * @param firstTypeName the value for question_detail.first_type_name
     *
     * @mbg.generated
     */
    public void setFirstTypeName(String firstTypeName) {
        this.firstTypeName = firstTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.second_type_id
     *
     * @return the value of question_detail.second_type_id
     *
     * @mbg.generated
     */
    public Integer getSecondTypeId() {
        return secondTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.second_type_id
     *
     * @param secondTypeId the value for question_detail.second_type_id
     *
     * @mbg.generated
     */
    public void setSecondTypeId(Integer secondTypeId) {
        this.secondTypeId = secondTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.second_type_name
     *
     * @return the value of question_detail.second_type_name
     *
     * @mbg.generated
     */
    public String getSecondTypeName() {
        return secondTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.second_type_name
     *
     * @param secondTypeName the value for question_detail.second_type_name
     *
     * @mbg.generated
     */
    public void setSecondTypeName(String secondTypeName) {
        this.secondTypeName = secondTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.thrid_type_id
     *
     * @return the value of question_detail.thrid_type_id
     *
     * @mbg.generated
     */
    public Integer getThridTypeId() {
        return thridTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.thrid_type_id
     *
     * @param thridTypeId the value for question_detail.thrid_type_id
     *
     * @mbg.generated
     */
    public void setThridTypeId(Integer thridTypeId) {
        this.thridTypeId = thridTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.thrid_type_name
     *
     * @return the value of question_detail.thrid_type_name
     *
     * @mbg.generated
     */
    public String getThridTypeName() {
        return thridTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.thrid_type_name
     *
     * @param thridTypeName the value for question_detail.thrid_type_name
     *
     * @mbg.generated
     */
    public void setThridTypeName(String thridTypeName) {
        this.thridTypeName = thridTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.source_id
     *
     * @return the value of question_detail.source_id
     *
     * @mbg.generated
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.source_id
     *
     * @param sourceId the value for question_detail.source_id
     *
     * @mbg.generated
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.source_name
     *
     * @return the value of question_detail.source_name
     *
     * @mbg.generated
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.source_name
     *
     * @param sourceName the value for question_detail.source_name
     *
     * @mbg.generated
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.creator
     *
     * @return the value of question_detail.creator
     *
     * @mbg.generated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.creator
     *
     * @param creator the value for question_detail.creator
     *
     * @mbg.generated
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.class_id
     *
     * @return the value of question_detail.class_id
     *
     * @mbg.generated
     */
    public String getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.class_id
     *
     * @param classId the value for question_detail.class_id
     *
     * @mbg.generated
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.location
     *
     * @return the value of question_detail.location
     *
     * @mbg.generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.location
     *
     * @param location the value for question_detail.location
     *
     * @mbg.generated
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.live_room
     *
     * @return the value of question_detail.live_room
     *
     * @mbg.generated
     */
    public String getLiveRoom() {
        return liveRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.live_room
     *
     * @param liveRoom the value for question_detail.live_room
     *
     * @mbg.generated
     */
    public void setLiveRoom(String liveRoom) {
        this.liveRoom = liveRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_detail.resolvor
     *
     * @return the value of question_detail.resolvor
     *
     * @mbg.generated
     */
    public String getResolvor() {
        return resolvor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_detail.resolvor
     *
     * @param resolvor the value for question_detail.resolvor
     *
     * @mbg.generated
     */
    public void setResolvor(String resolvor) {
        this.resolvor = resolvor;
    }
}