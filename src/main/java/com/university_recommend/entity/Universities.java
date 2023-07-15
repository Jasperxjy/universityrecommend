package com.university_recommend.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Universities)表实体类
 *
 * @author makejava
 * @since 2023-07-14 23:18:10
 */
@SuppressWarnings("serial")
public class Universities extends Model<Universities> {
    
    private String name;
    
    private String levelType;
    
    private String province;
    
    private String sexrate;
    
    private String getjobrate;
    
    private String furstudyrate;
    
    private String abrstudyrate;
    
    private String avjpay;
    
    private String info;
    
    private Integer clicknum;
    
    private String homeurl;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSexrate() {
        return sexrate;
    }

    public void setSexrate(String sexrate) {
        this.sexrate = sexrate;
    }

    public String getGetjobrate() {
        return getjobrate;
    }

    public void setGetjobrate(String getjobrate) {
        this.getjobrate = getjobrate;
    }

    public String getFurstudyrate() {
        return furstudyrate;
    }

    public void setFurstudyrate(String furstudyrate) {
        this.furstudyrate = furstudyrate;
    }

    public String getAbrstudyrate() {
        return abrstudyrate;
    }

    public void setAbrstudyrate(String abrstudyrate) {
        this.abrstudyrate = abrstudyrate;
    }

    public String getAvjpay() {
        return avjpay;
    }

    public void setAvjpay(String avjpay) {
        this.avjpay = avjpay;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public String getHomeurl() {
        return homeurl;
    }

    public void setHomeurl(String homeurl) {
        this.homeurl = homeurl;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.name;
    }
    }

