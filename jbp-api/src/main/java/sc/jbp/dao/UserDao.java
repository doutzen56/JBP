    

package sc.jbp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import sc.jbp.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 *  tzen@e-veb.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
