

package sc.jbp.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import sc.jbp.common.utils.PageUtils;
import sc.jbp.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 * <p>
 * tzen@e-veb.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
