package cn.edu.sanda.entity;

import java.io.Serializable;

/**
 * 菜单表(Menu)实体类
 *
 * @author makejava
 * @since 2020-11-08 10:28:50
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = -65320311946795196L;
    /**
    * 自增id
    */
    private Integer id;
    /**
    * 父id
    */
    private Integer pid;
    /**
    * 菜单名称
    */
    private String title;
    /**
    * 菜单地址
    */
    private String href;
    /**
    * 菜单图标
    */
    private String icon;
    /**
    * 能否展开，0可展开，1不可用
    */
    private String spread;
    /**
    * 菜单可用，0可用，1不可用
    */
    private String available;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

}