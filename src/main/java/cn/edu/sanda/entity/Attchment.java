package cn.edu.sanda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Attchment)实体类
 *
 * @author makejava
 * @since 2020-11-05 23:41:22
 */
public class Attchment implements Serializable {
    private static final long serialVersionUID = 472804827885406449L;
    /**
    * 自增id
    */
    private Integer id;
    /**
    * 附件名称
    */
    private String attchmentName;
    /**
    * 附件路径
    */
    private String path;
    /**
    * 附件描述
    */
    private String description;
    /**
    * 附件扩展名
    */
    private String suffix;
    /**
    * 附件大小
    */
    private Long size;
    
    private String originalName;
    /**
    * 是否删除
    */
    private Integer isDelete2;
    /**
    * 创建日期
    */
    private Date createdDateTime;
    /**
    * 创建用户
    */
    private String createdById;
    /**
    * 更新日期
    */
    private Date updatedDateTime;
    /**
    * 更新用户
    */
    private String updatedById;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttchmentName() {
        return attchmentName;
    }

    public void setAttchmentName(String attchmentName) {
        this.attchmentName = attchmentName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public Integer getIsDelete2() {
        return isDelete2;
    }

    public void setIsDelete2(Integer isDelete2) {
        this.isDelete2 = isDelete2;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
    }

}