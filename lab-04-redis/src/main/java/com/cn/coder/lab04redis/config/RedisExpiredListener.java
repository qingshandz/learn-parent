package com.cn.coder.lab04redis.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;


/**
 * @USER wh
 * @DATE 2020/12/31
 * @Description
 */
@Component
public class RedisExpiredListener extends KeyExpirationEventMessageListener {
    private final static Logger logger = LoggerFactory.getLogger(RedisExpiredListener.class);

    public RedisExpiredListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        //key=iot:device:command:868474043308814_b39d7fb91ef74ff6a205761b62cff0fb_aaaaaa
        String channel = new String(message.getChannel(), StandardCharsets.UTF_8);
        //过期的key
        String key = new String(message.getBody(), StandardCharsets.UTF_8);
        logger.info("redis key 过期：pattern={},channel={},key={}", new String(pattern), channel, key);
    }
}
