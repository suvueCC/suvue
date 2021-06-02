package cn.suvue.common.constant;

/**
 * 鉴权相关常量池
 *
 * @author suvuecc
 * @date 2021/05/17 12:56
 */
public interface AuthConst {

    /**
     * 匿名用户 用户名
     */
    String ANONYMOUS_NAME = "匿名用户";

    /**
     * 资源相关
     */
    interface Resource {
        /**
         * 页面
         */
        Integer PAGE = 1;

        /**
         * 按钮
         */
        Integer BUTTON = 2;
    }

    /**
     * jwt相关
     */
    interface Jwt {
        /**
         * JWT 在 Redis 中保存的key前缀
         */
        String REDIS_JWT_KEY_PREFIX = "security:jwt:";
    }

}
