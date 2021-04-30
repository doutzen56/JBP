

package sc.jbp.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import sc.jbp.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * <p>
 * tzen@e-veb.com
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {

}
