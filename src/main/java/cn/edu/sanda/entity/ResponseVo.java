package cn.edu.sanda.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回给前端的Response实体
 */
@Data//get,set
@NoArgsConstructor//无参构造器
public class ResponseVo<T> {
    private String code;
    private String msg;
    private T data;


    public ResponseVo(String resultCode, String resultMsg) {
        super();
        this.setCode(resultCode);
        this.setMsg(resultMsg);
    }

    public static final String SUCCESS = "0";
    public static final String SUCCESS_MESSAGE = "操作成功！";
    public static final String ERROR = "1";
    public static final String ERROR_MESSAGE = "服务异常！";


}
