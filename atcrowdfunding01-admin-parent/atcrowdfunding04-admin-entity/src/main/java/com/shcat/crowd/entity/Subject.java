package com.shcat.crowd.entity;

/**
 * @author shcat
 * @description
 * @create 2022.11.3 11:02:24
 */
public class Subject {
    private String subName;
    private Integer subScore;

    // 构造器、getter、setter、toString

    public Subject() {
    }

    public Subject(String subName, Integer subScore) {
        this.subName = subName;
        this.subScore = subScore;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getSubScore() {
        return subScore;
    }

    public void setSubScore(Integer subScore) {
        this.subScore = subScore;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", subScore=" + subScore +
                '}';
    }
}
