package cn.edu.sanda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息表(Admin)实体类
 *
 * @author makejava
 * @since 2020-11-05 23:41:17
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -46768851485575115L;
    /**
    * 自增id
    */
    private Integer id;
    /**
    * 用户真实姓名
    */
    private String adminName;
    /**
    * 用户账户
    */
    private String accoutNumber;
    /**
    * 用户昵称
    */
    private String nickName;
    /**
    * 用户密码
    */
    private String adminPwd;
    /**
    * 用户头像，默认头像
    */
    private Integer personalAvatar;
    /**
    * 用户地址
    */
    private String personalAddress;
    /**
    * 用户生日
    */
    private Date personalBirthday;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public Integer getPersonalAvatar() {
        return personalAvatar;
    }

    public void setPersonalAvatar(Integer personalAvatar) {
        this.personalAvatar = personalAvatar;
    }

    public String getPersonalAddress() {
        return personalAddress;
    }

    public void setPersonalAddress(String personalAddress) {
        this.personalAddress = personalAddress;
    }

    public Date getPersonalBirthday() {
        return personalBirthday;
    }

    public void setPersonalBirthday(Date personalBirthday) {
        this.personalBirthday = personalBirthday;
    }

}