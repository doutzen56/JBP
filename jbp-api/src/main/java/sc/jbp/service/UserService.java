

package sc.jbp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import sc.jbp.entity.UserEntity;
import sc.jbp.form.LoginForm;

import java.util.Map;

/**
 * 用户
 * <p>
 * tzen@e-veb.com
 */
public interface UserService extends IService<UserEntity> {

    UserEntity queryByMobile(String mobile);

    /**
     * 用户登录
     *
     * @param form 登录表单
     * @return 返回登录信息
     */
    Map<String, Object> login(LoginForm form);
}
