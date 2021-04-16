

package sc.jbp.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import sc.jbp.common.utils.PageUtils;
import sc.jbp.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 数据字典
 *
 *  tzen@e-veb.com
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

