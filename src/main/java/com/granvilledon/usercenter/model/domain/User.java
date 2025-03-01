package com.granvilledon.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 *
 * @author <a href="https://github.com/granvilledon">granvilledon</a>
 */
// todo 可使用双锁单例优化
/*
public class SingleInstance {
    // 必须有volatile修饰（防止指令重排序）
    private volatile static SingleInstance instance;

    // 构造函数必须私有（防止外部通过构造方法创建对象）
    private SingleInstance() {
    }

    public static SingleInstance getInstance() {
        // 第一个判空（如果是空，就不必再进入同步代码块了，提升效率）
        if (instance == null) {
                // 这里加锁，是为了防止多线程的情况下出现实例化多个对象的情况
            synchronized (SingleInstance.class) {
                // 第二个判空（如果是空，就实例化对象）
                if (instance == null) {
                    // 新建实例
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }
}
*/
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态 0 - 正常
     */
    private Integer userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 用户角色 0 - 普通用户 1 - 管理员
     */
    private Integer userRole;

    /**
     * 星球编号
     */
    private String planetCode;

    // https://github.com/granvilledon

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

