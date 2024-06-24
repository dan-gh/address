package top.vava.address.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Villages)表实体类
 *
 * @author makejava
 * @since 2024-06-23 18:51:22
 */
@SuppressWarnings("serial")
@Data
public class Villages extends Model<Villages> {

    private String code;

    private String name;

    private Integer streetcode;

    private Integer areacode;

    private Integer citycode;

    private Integer provincecode;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStreetcode() {
        return streetcode;
    }

    public void setStreetcode(Integer streetcode) {
        this.streetcode = streetcode;
    }

    public Integer getAreacode() {
        return areacode;
    }

    public void setAreacode(Integer areacode) {
        this.areacode = areacode;
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

