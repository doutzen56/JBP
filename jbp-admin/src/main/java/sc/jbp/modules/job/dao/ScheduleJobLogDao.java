

package sc.jbp.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import sc.jbp.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * <p>
 * tzen@e-veb.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {

}
