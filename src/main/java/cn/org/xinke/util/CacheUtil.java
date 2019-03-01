package cn.org.xinke.util;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description 缓存工具类
 * @author cinco
 * @date 2019-1-24
 */
public class CacheUtil {

    /** 数据缓存map */
    public static Map<String, Object> dataMap = new ConcurrentHashMap<>();

    /** 数据缓存过期map */
    public static Map<String, Date> dataExpireMap = new ConcurrentHashMap<>();

    /**
     * 将一个key、value值放入内存缓存,并设置过期分钟数
     *
     * @param key
     * @param val
     * @param expireMiute
     */
    public static void put(String key, Object val, int expireMiute) {
        dataMap.put(key, val);
        dataExpireMap.put(key, addMinutes(expireMiute));
    }

    /**
     * 从缓存中获取一个key的数据,若过期返回null
     *
     * @param cacheKey
     * @return
     */
    public static Object get(String cacheKey) {
        Object obj = null;
        Date expireDate = CacheUtil.dataExpireMap.get(cacheKey);
        if (expireDate != null && expireDate.compareTo(new Date()) > 0) {
            obj = CacheUtil.dataMap.get(cacheKey);
        }
        return obj;
    }

    /**
     * 将有效时间(分钟)转成日期
     *
     * @param expireMiute
     * @return Date
     */
    public static Date addMinutes(int expireMiute){
        long currentTime = System.currentTimeMillis();
        currentTime += expireMiute * 1000 * 60;
        Date date = new Date(currentTime);
        return date;
    }

}
