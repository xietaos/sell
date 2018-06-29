package cn.xt.sell.enums;

import lombok.Getter;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 00:32
 * @Description:
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
