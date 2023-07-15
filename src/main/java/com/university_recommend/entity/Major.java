package com.university_recommend.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Major)表实体类
 *
 * @author makejava
 * @since 2023-07-14 23:15:43
 */
@SuppressWarnings("serial")
public class Major extends Model<Major> {

    private String majorname;

    private String university;

    private String majorinfo;

    private String level;

    private String instituteurl;

    private String requirements;


    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajorinfo() {
        return majorinfo;
    }

    public void setMajorinfo(String majorinfo) {
        this.majorinfo = majorinfo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInstituteurl() {
        return instituteurl;
    }

    public void setInstituteurl(String instituteurl) {
        this.instituteurl = instituteurl;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.majorname;
    }
}

