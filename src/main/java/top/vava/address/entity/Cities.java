package top.vava.address.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Cities)表实体类
 *
 * @author makejava
 * @since 2024-06-23 18:50:38
 */
@SuppressWarnings("serial")
@Data
public class Cities extends Model<Cities> {

    private Integer code;

    private String name;

    private Integer provincecode;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(Integer provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.code;
    }
}

