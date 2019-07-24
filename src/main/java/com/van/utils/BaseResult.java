package com.van.utils;


import com.alibaba.fastjson.JSONObject;

/**
 * @Author TangFuwan
 * @date 2019-07-23 16:02
 * @package com.van.utils
 */
public class BaseResult {

    public static JSONObject success(){
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","操作成功");
        json.put("data",null);
        return json;
    }

    public static JSONObject success(Object object){
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","操作成功");
        json.put("data",object);
        return json;
    }

    public static JSONObject fail(){
        JSONObject json = new JSONObject();
        json.put("code",500);
        json.put("msg","操作成功");
        json.put("data",null);
        return json;
    }

    public static JSONObject fail(String msg){
        JSONObject json = new JSONObject();
        json.put("code",500);
        json.put("msg",msg);
        json.put("data",null);
        return json;
    }

}
