package com.zzq.service0.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhiqiang
 * @date 2018-08-22 15:55
 * &Desc 充值枚举变量
 */
public enum ChargeValueEnum {

    BIGGERVALUE(50,"50元充值面额"),
    SMALLERVALUE(20,"20元充值面额");
    /** 枚举值码 */
    private final Integer code;

    /** 枚举描述 */
    private final String message;

    /**
     * 构建一个 Status 。
     * @param code 枚举值码。
     * @param message 枚举描述。
     */
    private ChargeValueEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 得到枚举值码。
     * @return 枚举值码。
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 得到枚举描述。
     * @return 枚举描述。
     */
    public String getMessage() {
        return message;
    }


    /**
     * 得到枚举值码。
     * @return 枚举值码。
     */
    public Integer code() {
        return code;
    }

    /**
     * 得到枚举描述。
     * @return 枚举描述。
     */
    public String message() {
        return message;
    }

    /**
     * 通过枚举值码查找枚举值。
     * @param code 查找枚举值的枚举值码。
     * @return 枚举值码对应的枚举值。
     * @throws IllegalArgumentException 如果 code 没有对应的 Status 。
     */
    public static ChargeValueEnum findStatus(Integer code) {
        for (ChargeValueEnum status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举值。
     *
     * @return 全部枚举值。
     */
    public static List<ChargeValueEnum> getAllStatus() {
        List<ChargeValueEnum> list = new ArrayList<ChargeValueEnum>();
        for (ChargeValueEnum status : values()) {
            list.add(status);
        }
        return list;
    }

    /**
     * 获取全部枚举值码。
     *
     * @return 全部枚举值码。
     */
    public static List<Integer> getAllStatusCode() {
        List<Integer> list = new ArrayList<Integer>();
        for (ChargeValueEnum status : values()) {
            list.add(status.code());
        }
        return list;
    }
}
