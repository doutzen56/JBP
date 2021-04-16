

package sc.jbp.annotation;

import java.lang.annotation.*;

/**
 * 登录效验
 *
 *  tzen@e-veb.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
