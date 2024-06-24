package top.vava.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.vava.address.mapper.VillagesMapper;
import top.vava.address.entity.Villages;
import top.vava.address.service.VillagesService;
import org.springframework.stereotype.Service;

/**
 * (Villages)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 18:51:22
 */
@Service("villagesService")
public class VillagesServiceImpl extends ServiceImpl<VillagesMapper, Villages> implements VillagesService {

}

