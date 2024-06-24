package top.vava.address.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import top.vava.address.entity.*;
import top.vava.address.service.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 25380
 */
@Service
public class AddressServiceImpl implements AddressService {

    private ProvincesService provincesService;

    private CitiesService citiesService;

    private AreasService areasService;

    private StreetsService streetsService;

    private VillagesService villagesService;

    private Map<String, List<Cities>> provinceMap = new HashMap<String, List<Cities>>();

    public AddressServiceImpl(ProvincesService provincesService, CitiesService citiesService, AreasService areasService, StreetsService streetsService, VillagesService villagesService) {
        this.provincesService = provincesService;
        this.citiesService = citiesService;
        this.areasService = areasService;
        this.streetsService = streetsService;
        this.villagesService = villagesService;
        initProvinceMap();
    }

    @Override
    public Address addressHandler(String address) {
        address = clearAddress(address);
        if (address.isEmpty()) {
            return null;
        }
        String addressProvince = address.substring(0, 2);
        if ("黑龙".equals(addressProvince)) {
            addressProvince = "黑龙江";
        }else if ("内蒙".equals(addressProvince)) {
            addressProvince = "内蒙古";
        }
        List<Cities> cities = provinceMap.get(addressProvince);
        if (cities == null) {
            cities = provinceMap.get("广东");
        }

        return null;
    }

    private String clearAddress(String address) {
        address = address.replaceAll(" ", "");
        address = address.replaceAll("\t", "");
        address = address.replaceAll("\n", "");
        return address;
    }

    private void initProvinceMap() {
        QueryWrapper<Cities> citiesQueryWrapper = new QueryWrapper<Cities>();
        citiesQueryWrapper.eq("provinceCode", 11);
        this.provinceMap.put("北京", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 12);
        this.provinceMap.put("天津", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 13);
        this.provinceMap.put("河北", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 14);
        this.provinceMap.put("山西", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 15);
        this.provinceMap.put("内蒙古", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 21);
        this.provinceMap.put("辽宁", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 22);
        this.provinceMap.put("吉林", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 23);
        this.provinceMap.put("黑龙江", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 31);
        this.provinceMap.put("上海", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 32);
        this.provinceMap.put("江苏", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 33);
        this.provinceMap.put("浙江", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 34);
        this.provinceMap.put("安徽", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 35);
        this.provinceMap.put("福建", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 36);
        this.provinceMap.put("江西", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 37);
        this.provinceMap.put("山东", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 41);
        this.provinceMap.put("河南", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 42);
        this.provinceMap.put("湖北", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 43);
        this.provinceMap.put("湖南", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 44);
        this.provinceMap.put("广东", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 45);
        this.provinceMap.put("广西", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 46);
        this.provinceMap.put("海南", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 50);
        this.provinceMap.put("重庆", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 51);
        this.provinceMap.put("四川", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 52);
        this.provinceMap.put("贵州", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 53);
        this.provinceMap.put("云南", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 54);
        this.provinceMap.put("西藏", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 61);
        this.provinceMap.put("陕西", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 62);
        this.provinceMap.put("甘肃", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 63);
        this.provinceMap.put("青海", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 64);
        this.provinceMap.put("宁夏", citiesService.list(citiesQueryWrapper));
        citiesQueryWrapper.clear();
        citiesQueryWrapper.eq("provinceCode", 65);
        this.provinceMap.put("新疆", citiesService.list(citiesQueryWrapper));
        System.out.println("provinceMap = " + provinceMap);

    }
}
