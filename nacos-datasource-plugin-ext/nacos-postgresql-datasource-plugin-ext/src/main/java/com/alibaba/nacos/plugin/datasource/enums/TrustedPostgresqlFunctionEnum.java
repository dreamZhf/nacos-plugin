package com.alibaba.nacos.plugin.datasource.enums;

/**
 * pgsql 函数枚举
 *
 * @author zhaohaifan
 */
public enum TrustedPostgresqlFunctionEnum {

    /**
     * NOW().
     */
    NOW("NOW()", "CURRENT_TIMESTAMP");

    /**
     * 函数名
     */
    private final String functionName;

    /**
     * 函数
     */
    private final String function;

    TrustedPostgresqlFunctionEnum(String functionName, String function) {
        this.functionName = functionName;
        this.function = function;
    }

    /**
     * Get the function name.
     *
     * @param functionName function name
     * @return function
     */
    public static String getFunctionByName(String functionName) {
        if (functionName == null || functionName.isEmpty()) {
            throw new IllegalArgumentException("Invalid function name, functionName is null");
        }
        TrustedPostgresqlFunctionEnum[] values = TrustedPostgresqlFunctionEnum.values();
        for (TrustedPostgresqlFunctionEnum value : values) {
            if (value.functionName.equals(functionName)) {
                return value.function;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid function name: %s", functionName));
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getFunction() {
        return function;
    }
}
