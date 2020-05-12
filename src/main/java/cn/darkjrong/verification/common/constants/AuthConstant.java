package cn.darkjrong.verification.common.constants;

import java.util.Arrays;
import java.util.List;

/**
 * 权限相关常量类
 *
 * @author Rong.Jia
 * @date 2020/05/11 22:59
 */
public class AuthConstant {

    /**
     * 管理员用户
     */
    public static final String ADMINISTRATOR = "admin";

    /**
     * redis-key-前缀-security:cache:
     */
    public final static String PREFIX_SHIRO_CACHE = "security:cache:";

    /**
     * JWT-account:
     */
    public final static String ACCOUNT = "account";

    /**
     * redis-key-前缀-security:access_token:
     */
    public final static String PREFIX_SHIRO_ACCESS_TOKEN = "security:access_token:";

    /**
     * redis-key-前缀-security:refresh_token:
     */
    public final static String PREFIX_SHIRO_REFRESH_TOKEN = "security:refresh_token:";

    /**
     * JWT-currentTimeMillis:
     */
    public final static String CURRENT_TIME_MILLIS = "currentTimeMillis";

    /**
     * HTTP Authorization header, equal to <code>Authorization</code>
     */
    public static final String AUTHORIZATION_HEADER = "Authorization";

    /**
     * HTTP Authentication header, equal to <code>WWW-Authenticate</code>
     */
    public static final String AUTHENTICATE_HEADER = "Authenticate";

    /**
     *  验证时间 header
     */
    public static final String X_CA_TIMESTAMP = "x-ca-timestamp";

    /**
     *  默认密码
     */
    public static final String DEFAULT_PASSWORD = "ABCabc123456";

    /**
     * redis-key-前缀-security:vc_cache:
     */
    public final static String PREFIX_AUTH_VC_CODE_CACHE = "security:vc_cache:";

    /**
     * 用户登录次数计数  redisKey 前缀
     */
    public static  final String PREFIX_SHIRO_LOGIN_COUNT = "security:login_count:";

    /**
     * 用户登录是否被锁定 一小时 redisKey 前缀
     */
    public static  final String  PREFIX_SHIRO_IS_LOCK = "security:is_lock:";

    /**
     *  user -- lock or unlock
     */
    public static final List<String> USER_LOCK_UN = Arrays.asList("LOCK", "UNLOCK");

    /**
     * redis-key-前缀-auth:user_cache:
     */
    public final static String PREFIX_AUTH_USER_CACHE = "security:user_cache:";

}
