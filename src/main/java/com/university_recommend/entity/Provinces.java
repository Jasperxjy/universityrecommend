package com.university_recommend.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Provinces)表实体类
 *
 * @author makejava
 * @since 2023-07-14 23:17:54
 */
@SuppressWarnings("serial")
public class Provinces extends Model<Provinces> {
    
    private String province;
    
    private Integer universitynum;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getUniversitynum() {
        return universitynum;
    }

    public void setUniversitynum(Integer universitynum) {
        this.universitynum = universitynum;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.province;
    }
    }

