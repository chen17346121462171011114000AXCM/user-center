package com.itmuch.usercenter.domain.entity.share;

import javax.persistence.*;

@Table(name = "share")
public class Share {
    /**
     * 序号
     */
    @Id
    @Column(name = "content_id")
    private Integer contentId;

    /**
     * 内容
     */
    private String content;

    /**
     * 获取序号
     *
     * @return content_id - 序号
     */
    public Integer getContentId() {
        return contentId;
    }

    /**
     * 设置序号
     *
     * @param contentId 序号
     */
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}