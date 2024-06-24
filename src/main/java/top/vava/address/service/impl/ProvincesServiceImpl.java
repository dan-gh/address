package top.vava.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.vava.address.mapper.ProvincesMapper;
import top.vava.address.entity.Provinces;
import top.vava.address.service.ProvincesService;
import org.springframework.stereotype.Service;

/**
 * (Provinces)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 13:04:49
 */
@Service("provincesService")
public class ProvincesServiceImpl extends ServiceImpl<ProvincesMapper, Provinces> implements ProvincesService {

}

