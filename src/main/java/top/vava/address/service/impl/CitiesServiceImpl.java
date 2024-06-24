package top.vava.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.vava.address.mapper.CitiesMapper;
import top.vava.address.entity.Cities;
import top.vava.address.service.CitiesService;
import org.springframework.stereotype.Service;

/**
 * (Cities)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 18:50:38
 */
@Service("citiesService")
public class CitiesServiceImpl extends ServiceImpl<CitiesMapper, Cities> implements CitiesService {

}

