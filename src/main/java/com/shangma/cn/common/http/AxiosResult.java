package com.shangma.cn.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 20:11
 * @Description
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {

    private int status;
    private String message;
    private T data;

    public AxiosResult() {
    }

    /**
     * 成功返回的方法
     */
    public static <T> AxiosResult<T> success(){
        return setData(AxiosStatus.OK,null);
    }

    /**
     * 成功返回的方法 携带数据
     */
    public static <T> AxiosResult<T> success(T data){
        return setData(AxiosStatus.OK,data);
    }

    /**
     * 成功返回的方法 自定义状态码
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }

    /**
     * 成功返回的方法 自定义状态码 携带数据
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }

    /**
     * 失败返回的方法
     */
    public static <T> AxiosResult<T> error(){
        return setData(AxiosStatus.ERROR,null);
    }

    /**
     * 失败返回的方法 携带数据
     */
    public static <T> AxiosResult<T> error(T data){
        return setData(AxiosStatus.ERROR,data);
    }

    /**
     * 失败返回的方法 自定义状态码
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }

    /**
     * 失败返回的方法 自定义状态码 携带数据
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }


    /**
     * 封装数据公共方法
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setMessage(axiosStatus.getMessage());
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setData(data);
        return axiosResult;
    }
}
