package cn.edu.sanda.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息表(Admin)实体类
 *
 * @author makejava
 * @since 2021-02-21 17:37:43
 */
@Data
@TableName("admin")
public class Admin implements Serializable {
    private static final long serialVersionUID = -18731846383917294L;
    /**
    * 自增id
    */
    private Integer id;
    /**
    * 用户账户
    */
    private String adminAccout;
    /**
    * 用户真实姓名
    */
    private String adminName;
    /**
    * 用户手机号
    */
    private String adminPhone;
    /**
    * 用户密码
    */
    private String adminPwd;
    /**
    * 用户性别
    */
    private Integer adminGender;
    /**
    * 用户地址
    */
    private String adminAddress;
    /**
    * 用户生日
    */
    private Date adminBirthday;
    /**
     * 用户类型
     */
    private String adminType;
    /**
     *
     */
    private String adminStatus;
    /**
     *用户头像
     */
    private String adminPhoto;

}