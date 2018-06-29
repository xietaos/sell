package cn.xt.sell.utils;

import java.util.Random;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 09:38
 * @Description:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}
