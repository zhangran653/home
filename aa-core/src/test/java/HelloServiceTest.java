import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.bb.service.HelloService;

public class HelloServiceTest {

	private HelloService service;

	@Before
	public void before() {
		// 1、读取配置文件实例化一个IoC容器
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/config/spring-context.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		service = context.getBean("hello", HelloService.class);
	}

	@Test
	public void testHelloWorld() {
		
		service.sayHello();

	}
}
