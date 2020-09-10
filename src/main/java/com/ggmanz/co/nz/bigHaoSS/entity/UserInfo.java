package com.ggmanz.co.nz.bigHaoSS.entity;

import lombok.Data;

/**
 * Created by mazhuang on 2018/6/27.
 */
@Data
public class UserInfo {

    private int    id;
    private int    groupId;
    private String name;
    private String email;
    private String gender;
    private String avatar;
    private String idNum;
    private String phoneNum;
    private String school;
    private String distributing;
    private String highPerformance;
    private String registerDate;
    private String english;
    private String circle;
    private String aptl;
    private String newEmployee;
    private String cbt;
    private String fixedModule;
    private String movedModule;
    private String thisField;
    private String remark;
    private String[] pictures;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDistributing() {
        return distributing;
    }

    public void setDistributing(String distributing) {
        this.distributing = distributing;
    }

    public String getHighPerformance() {
        return highPerformance;
    }

    public void setHighPerformance(String highPerformance) {
        this.highPerformance = highPerformance;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getAptl() {
        return aptl;
    }

    public void setAptl(String aptl) {
        this.aptl = aptl;
    }

    public String getNewEmployee() {
        return newEmployee;
    }

    public void setNewEmployee(String newEmployee) {
        this.newEmployee = newEmployee;
    }

    public String getCbt() {
        return cbt;
    }

    public void setCbt(String cbt) {
        this.cbt = cbt;
    }

    public String getFixedModule() {
        return fixedModule;
    }

    public void setFixedModule(String fixedModule) {
        this.fixedModule = fixedModule;
    }

    public String getMovedModule() {
        return movedModule;
    }

    public void setMovedModule(String movedModule) {
        this.movedModule = movedModule;
    }

    public String getThisField() {
        return thisField;
    }

    public void setThisField(String thisField) {
        this.thisField = thisField;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String[] getPictures() {
        return pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }
}
