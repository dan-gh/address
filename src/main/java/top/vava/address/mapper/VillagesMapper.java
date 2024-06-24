package top.vava.address.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.vava.address.entity.Villages;

/**
 * (Villages)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-23 18:51:22
 */
public interface VillagesMapper extends BaseMapper<Villages> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<Villages> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<Villages> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<Villages> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<Villages> entities);

}

