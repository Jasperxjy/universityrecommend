package com.university_recommend.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (ProMajAllocation)表实体类
 *
 * @author makejava
 * @since 2023-07-14 23:17:33
 */
@SuppressWarnings("serial")
public class ProMajAllocation extends Model<ProMajAllocation> {
    
    private String university;
    
    private String major;
    
    private String province;
    
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

