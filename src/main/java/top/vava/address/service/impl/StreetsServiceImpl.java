package top.vava.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.vava.address.mapper.StreetsMapper;
import top.vava.address.entity.Streets;
import top.vava.address.service.StreetsService;
import org.springframework.stereotype.Service;

/**
 * (Streets)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 18:51:10
 */
@Service("streetsService")
public class StreetsServiceImpl extends ServiceImpl<StreetsMapper, Streets> implements StreetsService {

}

