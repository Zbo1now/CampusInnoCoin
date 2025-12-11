package com.nft.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
    @Bean
    public RedissonClient redissonClient() {
        // 这里可以根据需要配置单机版、哨兵模式或集群版的Redisson客户端
        Config config = new Config();
        // 如果是单机版或哨兵模式，则使用相应的配置方法
        config.useSingleServer().setAddress("redis://common-redis-dev.magestack.cn:19389").setPassword("Sm9sVXBOYJjI030b5tz0trjpzvZzRhtZmEbv0uOImcD1wEDOPfeaqNU4PxHob/Wp"); // 单机版示例
        return Redisson.create(config);
    }
}
