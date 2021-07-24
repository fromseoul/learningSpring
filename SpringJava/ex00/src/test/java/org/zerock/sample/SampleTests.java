package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;



@RunWith(SpringJUnit4ClassRunner.class) // 현재 테스트 코드가 스프링을 실행하는 역할을 할 것
@ContextConfiguration(classes = {RootConfig.class}) // 지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내 객체로 등록
@Log4j // 로그
public class SampleTests {
	
	@Setter(onMethod_ = { @Autowired }) // Autowired --> 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시
	private Restaurant restaurant;
	
	@Test // 테스트 대상을 표시
	public void testExist() {
		
		assertNotNull(restaurant); // 테스트 대상이 null이 아니여만 테스트를 성공
		
		log.info(restaurant);
		log.info("----------------------------------------");
		log.info(restaurant.getChef());
	}
}
