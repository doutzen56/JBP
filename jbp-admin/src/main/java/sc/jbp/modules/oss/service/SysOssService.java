

package sc.jbp.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import sc.jbp.common.utils.PageUtils;
import sc.jbp.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 * <p>
 * tzen@e-veb.com
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
