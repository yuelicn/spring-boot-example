package org.spring.boot.preprocess;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * 服务启动后执行
 * @order 注解  标识执行顺序
 * 
 * @author yue.li3
 */
@Component
@Order(value = 1)
public class LoadMyDate implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("----------application start end  load my data-----------------");
	}

}
