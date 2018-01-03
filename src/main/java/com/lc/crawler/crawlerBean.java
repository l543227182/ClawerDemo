package com.lc.crawler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by luochao.byron on 2017/11/19.
 */
public class crawlerBean {
    private int id;
    private String resourceUrl;
    private String title;
    private String province;
    private String country;
    private String city;
    private String content;
    private List<itemComment> comments;
    private int commentsCount;
    private double avargeScore;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEachScoreCount() {
        return eachScoreCount;
    }

    public void setEachScoreCount(String eachScoreCount) {
        this.eachScoreCount = eachScoreCount;
    }

    private String eachScoreCount;


    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public double getAvargeScore() {
        return avargeScore;
    }

    public void setAvargeScore(double avargeScore) {
        this.avargeScore = avargeScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<itemComment> getComments() {
        return comments;
    }

    public crawlerBean() {
        this.comments = new ArrayList<itemComment>();
    }

    public void setComments(List<itemComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "crawlerBean{" +
                "id=" + id +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", title='" + title + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                ", commentsCount=" + commentsCount +
                ", avargeScore=" + avargeScore +
                ", remark='" + remark + '\'' +
                ", eachScoreCount='" + eachScoreCount + '\'' +
                '}';
    }
}

class itemComment{
    private String userType;
    private double score;
    private String simplizeComment;
    private String serviceComment;
    private String  overallComment;
    private String [] itemServiceDetailComment = new String [4];

    public String getServiceComment() {
        return serviceComment;
    }

    public void setServiceComment(String serviceComment) {
        this.serviceComment = serviceComment;
    }

    public String[] getItemServiceDetailComment() {
        return itemServiceDetailComment;
    }

    public void setItemServiceDetailComment(String[] itemServiceDetailComment) {
        this.itemServiceDetailComment = itemServiceDetailComment;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSimplizeComment() {
        return simplizeComment;
    }

    public void setSimplizeComment(String simplizeComment) {
        this.simplizeComment = simplizeComment;
    }

    public String getOverallComment() {
        return overallComment;
    }

    public void setOverallComment(String overallComment) {
        this.overallComment = overallComment;
    }

    @Override
    public String toString() {
        return "itemComment{" +
                "userType='" + userType + '\'' +
                ", score=" + score +
                ", simplizeComment='" + simplizeComment + '\'' +
                ", serviceComment='" + serviceComment + '\'' +
                ", overallComment='" + overallComment + '\'' +
                ", itemServiceDetailComment=" + Arrays.toString(itemServiceDetailComment) +
                '}';
    }
}
