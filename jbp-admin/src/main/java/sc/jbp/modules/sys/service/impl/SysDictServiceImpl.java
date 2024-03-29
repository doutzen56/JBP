

package sc.jbp.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import sc.jbp.common.utils.PageUtils;
import sc.jbp.common.utils.Query;
import sc.jbp.modules.sys.dao.SysDictDao;
import sc.jbp.modules.sys.entity.SysDictEntity;
import sc.jbp.modules.sys.service.SysDictService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysDictService")
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDictEntity> implements SysDictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String) params.get("name");

        IPage<SysDictEntity> page = this.page(
                new Query<SysDictEntity>().getPage(params),
                new QueryWrapper<SysDictEntity>()
                        .like(StringUtils.isNotBlank(name), "name", name)
        );

        return new PageUtils(page);
    }

}
