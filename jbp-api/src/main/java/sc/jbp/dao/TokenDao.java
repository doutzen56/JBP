

package sc.jbp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import sc.jbp.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 * <p>
 * tzen@e-veb.com
 */
@Mapper
public interface TokenDao extends BaseMapper<TokenEntity> {

}
