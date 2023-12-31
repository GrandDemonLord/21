/*
 * Copyright (c) Shanghai Qitong Information Technology Co., LTD 2023-2099
 */

package com.kunyu.assets.safety.common.enums.common;

/**
* 审批状态枚举类
*
* @author yangliu
* @date 2023-08-25
*/
public enum ApproveStatusEnum {
    /**
     * 源数据
     */
    SOURCEPENDING("source_pending", "待审批"),
    SOURCEAPPROVED("source_approved", "审批通过"),
    SOURCEREJECTION("source_rejection", "审批驳回"),

    /**
     * 安全工作管理 任务工单
     */
    SWWORKORDERPENDING("workOrder_pending", "待审批"),
    SWWORKORDERAPPROVED("workOrder_approved", "审批通过"),
    SWWORKORDERREJECTION("workOrder_rejection", "审批驳回"),
    SWWORKORDERPROCESSED("workOrder_processed", "待处置");

    private String code;
    private String name;

    ApproveStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getCodeByName(String name) {
        for (ApproveStatusEnum statusEnum : ApproveStatusEnum.values()) {
            if (statusEnum.name.equals(name)) {
                return statusEnum.code;
            }
        }
        return null;
    }

    public static String getNameByCode(String code) {
        for (ApproveStatusEnum statusEnum : ApproveStatusEnum.values()) {
            if (statusEnum.code.equals(code)) {
                return statusEnum.name;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
