package org.lyc.framework.redis;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class RedisTakes<H,K,V> extends BaseRedisTakes<H,K,V>{


    private Logger logger = Logger.getLogger(String.valueOf(RedisTakes.class));

    public void add(K key, V value) {
        if(redisTemplate == null)
        {
            logger.warning("redisTemplate 实例化失败");
            return;
        }
        else
        {
            redisTemplate.opsForValue().set(key,value);
        }
    }

    public void add(H objectKey, K key, V value) {
        if(redisTemplate == null)
        {
            logger.warning("redisTemplate 实例化失败");
            return;
        }
        else
        {
            redisTemplate.opsForHash().put(objectKey,key,value);
        }
    }

    public void update(Object key, Object value) {

    }

    public void update(Object objectKey, Object key, Object value) {

    }

    public void delete() {

    }

    public V get(K key) {
        if(redisTemplate == null)
        {
            logger.warning("redisTemplate 实例化失败");
            return null;
        }
        else
        {
            return (V)redisTemplate.opsForValue().get(key);
        }
    }

    public V get(H objectKey,K key){
        if(redisTemplate == null)
        {
            logger.warning("redisTemplate 实例化失败");
            return null;
        }
        else
        {
            return (V)redisTemplate.opsForHash().get(objectKey,key);
        }
    }
}
