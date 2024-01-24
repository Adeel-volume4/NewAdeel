package com.tracking.config;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;



@Configuration
public class RedisConfig {
//  @Value("${redis.host}")
//  private String redisHost;
//
//  @Value("${redis.port}")
//  private int redisPort;

  @Bean
  public LettuceConnectionFactory redisConnectionFactory() {
    RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();

    return new LettuceConnectionFactory(configuration);
  }
  
//  @Bean
//  public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
//    return RedisCacheManager.create(connectionFactory);
//  }

  @Bean
  public RedisCacheManager cacheManager() {
    RedisCacheConfiguration cacheConfig = myDefaultCacheConfig(Duration.ofMinutes(10)).disableCachingNullValues();

    return RedisCacheManager.builder(redisConnectionFactory())
        .cacheDefaults(cacheConfig)
        .withCacheConfiguration("titles", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("title", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("employees", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("employee", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("users", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("user", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("activities", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("activity", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("userpings", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("userping", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("systems", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("system", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("screenshots", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("screenshot", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("roles", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("role", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("punches", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("punch", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("products", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("product", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("processes", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("process", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("mouses", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("mouse", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("keywords", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("keywords", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("keyboardloggers", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("keyboardloggers", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("idles", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("idle", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("departments", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("department", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("configurations", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("configuration", myDefaultCacheConfig(Duration.ofMinutes(1)))
        
        .withCacheConfiguration("categories", myDefaultCacheConfig(Duration.ofMinutes(5)))
        .withCacheConfiguration("category", myDefaultCacheConfig(Duration.ofMinutes(1)))
        .build();
  }

  private RedisCacheConfiguration myDefaultCacheConfig(Duration duration) {
    return RedisCacheConfiguration
        .defaultCacheConfig()
        .entryTtl(duration)
        .serializeValuesWith(SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
  }
}