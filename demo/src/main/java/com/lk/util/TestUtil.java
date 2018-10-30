package com.lk.util;

import java.io.IOException;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.util.SafeEncoder;

public class TestUtil {

	@Test
	public void jedisUtil() throws IOException {
		JedisUtil jedisUtils = JedisUtil.getInstance();
		JedisUtil.Hash hash = jedisUtils.new Hash();
		long i = hash.hdel("goods");
		System.out.println(i);
		//hash.hset("goods", "010", "111111");
		System.out.println(hash.hget("goods","010"));
		
		
		/*JedisUtil.Strings strings = jedisUtils.new Strings();
		strings.set("test","1111");
		System.out.println(strings.get("test"));*/
		
		/*Jedis jedis = new Jedis("127.0.0.1",6379,100000);
		System.out.println(jedis);
		jedis.set("test", "lk");
		System.out.println(jedis.get("test"));*/
	}
}