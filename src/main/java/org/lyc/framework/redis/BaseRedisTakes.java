package org.lyc.framework.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public abstract class BaseRedisTakes<H,K,V> {
    @Autowired
    protected RedisTemplate redisTemplate;

    public abstract void add(K key,V value);

    public abstract void add(H objectKey,K key,V value);

    public abstract void update(K key,V value);

    public abstract void update(H objectKey,K key,V value);

    public abstract void delete();

    public abstract V get(K key);
}
