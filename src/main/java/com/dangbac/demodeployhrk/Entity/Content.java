package com.dangbac.demodeployhrk.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
//@Table(name="CONTENT")
@Table(name="content")

public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id", columnDefinition = "serial")
    private Long idContent;

    //    @Column(name = "TITLE_CONTENT")
    @Column(name = "content_title")
    private String titleContent;

    //    @Column(name = "MAIN_CONTENT")
    @Column(name = "content_main")
    private String mainContent;

    //    @Column(name = "IMAGE_CONTENT")
    @Column(name = "content_image")
    private String imageContent;

    //    @Column(name="TIME_CONTENT")
    @Column(name="content_time")
    private Date timeContent;
    @Column(name = "content_topic")
    private Long topicContent;

    public Long getTopicContent() {
        return topicContent;
    }

    public Content(Long id , String title, String mainContent, String imageContent, Date timeContent) {
        this.idContent=id;
        this.titleContent = title;
        this.mainContent = mainContent;
        this.imageContent = imageContent;
        this.timeContent = timeContent;
    }
    public Content(String title, String mainContent, String imageContent, Date timeContent) {
        this.titleContent = title;
        this.mainContent = mainContent;
        this.imageContent = imageContent;
        this.timeContent = timeContent;
    }
    public Content(){}

    public Long getId() {
        return idContent
                ;
    }

    public void setId(Long id) {
        this.idContent = id;
    }

    public String getTitle() {
        return titleContent;
    }

    public void setTitle(String title) {
        this.titleContent = title;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

    public Date getTimeContent() {
        return timeContent;
    }

    public void setTimeContent(Date timeContent) {
        this.timeContent = timeContent;
    }


    public String InfoContent() {
        return "Content{" +
                "idContent=" + idContent +
                ", titleContent='" + titleContent + '\'' +
                ", mainContent='" + mainContent + '\'' +
                ", imageContent='" + imageContent + '\'' +
                ", timeContent=" + timeContent +
                ", topicContent=" + topicContent +
                '}';
    }
}
