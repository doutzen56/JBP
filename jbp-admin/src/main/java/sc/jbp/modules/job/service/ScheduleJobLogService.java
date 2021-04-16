

package sc.jbp.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import sc.jbp.common.utils.PageUtils;
import sc.jbp.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 *  tzen@e-veb.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
