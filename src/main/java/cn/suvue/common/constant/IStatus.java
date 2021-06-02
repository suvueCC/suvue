package cn.suvue.common.constant;

/**
 * REST API 错误码接口
 *
 * @author suvuecc
 * @date 2021/05/17 13:01
 */
public interface IStatus {

    /**
     * 状态码
     *
     * @return 状态码
     */
    Integer getCode();

    /**
     * 返回信息
     *
     * @return 返回信息
     */
    String getMessage();
}
