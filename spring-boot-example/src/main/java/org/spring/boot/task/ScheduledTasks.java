package org.spring.boot.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {

	@Scheduled(fixedRate = 1000 * 30)
	public void reportCurrenTime() {
		System.out.println("Scheduling Tasks Examples: The time is now " + dateFormat().format(new Date()));
	}

	// 每1分钟执行一次
	@Scheduled(cron = "0 */1 *  * * * ")
	public void reportCurrentByCron() {
		System.out.println("Scheduling Tasks Examples By Cron: The time is now " + dateFormat().format(new Date()));
	}

	private SimpleDateFormat dateFormat() {
		return new SimpleDateFormat("HH:mm:ss");
	}

}
