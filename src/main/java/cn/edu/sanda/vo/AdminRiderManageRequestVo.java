package cn.edu.sanda.vo;

import cn.edu.sanda.entity.Admin;
import lombok.Data;

import java.util.Date;

@Data
public class AdminRiderManageRequestVo {
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
    private Date adminType;
    /**
     *用户头像
     */
    private String adminPhoto;
}
