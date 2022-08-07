package hello.proxy;

import hello.proxy.config.AppV1Config;
import hello.proxy.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


//@Import(AppV1Config.class) //Class를 Spring Bean으로 등록
@Import({AppV1Config.class,AppV2Config.class}) //Class를 Spring Bean으로 등록
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의 -> config 패키지를 빼기위해 (설정 여러개 하기위해)
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

}
