package top.vava.address.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Areas)表实体类
 *
 * @author makejava
 * @since 2024-06-23 18:50:57
 */
@SuppressWarnings("serial")
@Data
public class Areas extends Model<Areas> {

    private Integer code;

    private String name;

    private Integer citycode;

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

    public Integer getCitycode() {
        return citycode;
    }

    public void setCitycode(Integer citycode) {
        this.citycode = citycode;
    }

    public Integer getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(Integer provincecode) {
        this.provincecode = provincecode;
    }

}

