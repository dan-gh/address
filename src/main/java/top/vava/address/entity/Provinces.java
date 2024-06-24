package top.vava.address.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Provinces)表实体类
 *
 * @author makejava
 * @since 2024-06-23 13:04:49
 */
@SuppressWarnings("serial")

@Data
public class Provinces extends Model<Provinces> {
//省份编码
    private Integer code;
//省份名字
    private String name;


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

}

