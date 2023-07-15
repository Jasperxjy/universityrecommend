package com.university_recommend.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (ProAllocation)表实体类
 *
 * @author makejava
 * @since 2023-07-14 23:17:00
 */
@SuppressWarnings("serial")
public class ProAllocation extends Model<ProAllocation> {
    
    private String university;
    
    private String province;
    
    private Integer enrollmentnum;
    
    private String stuProportion;
    
    private String fScore;
    
    private String sScore;
    
    private String tScore;
    
    private String fRank;
    
    private String sRank;
    
    private String tRank;


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getEnrollmentnum() {
        return enrollmentnum;
    }

    public void setEnrollmentnum(Integer enrollmentnum) {
        this.enrollmentnum = enrollmentnum;
    }

    public String getStuProportion() {
        return stuProportion;
    }

    public void setStuProportion(String stuProportion) {
        this.stuProportion = stuProportion;
    }

    public String getFScore() {
        return fScore;
    }

    public void setFScore(String fScore) {
        this.fScore = fScore;
    }

    public String getSScore() {
        return sScore;
    }

    public void setSScore(String sScore) {
        this.sScore = sScore;
    }

    public String getTScore() {
        return tScore;
    }

    public void setTScore(String tScore) {
        this.tScore = tScore;
    }

    public String getFRank() {
        return fRank;
    }

    public void setFRank(String fRank) {
        this.fRank = fRank;
    }

    public String getSRank() {
        return sRank;
    }

    public void setSRank(String sRank) {
        this.sRank = sRank;
    }

    public String getTRank() {
        return tRank;
    }

    public void setTRank(String tRank) {
        this.tRank = tRank;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.university;
    }
    }

