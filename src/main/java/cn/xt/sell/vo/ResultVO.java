package cn.xt.sell.vo;

import lombok.Data;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 16:47
 * @Description:
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示消息. */
    private String msg;

    /** 具体内容. */
    private T data;

}
