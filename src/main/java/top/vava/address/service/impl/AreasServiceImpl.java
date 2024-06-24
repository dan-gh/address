package top.vava.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.vava.address.mapper.AreasMapper;
import top.vava.address.entity.Areas;
import top.vava.address.service.AreasService;
import org.springframework.stereotype.Service;

/**
 * (Areas)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 18:50:57
 */
@Service("areasService")
public class AreasServiceImpl extends ServiceImpl<AreasMapper, Areas> implements AreasService {

}

