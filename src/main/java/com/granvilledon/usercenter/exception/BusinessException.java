package com.granvilledon.usercenter.exception;

import com.granvilledon.usercenter.common.ErrorCode;

/**
 * 自定义异常类
 *
 * @author <a href="https://github.com/granvilledon">granvilledon</a>
 */
public class BusinessException extends RuntimeException {

    /**
     * 异常码
     */
    private final int code;

    /**
     * 描述
     */
    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    // https://t.zsxq.com/0emozsIJh

    public String getDescription() {
        return description;
    }
}
