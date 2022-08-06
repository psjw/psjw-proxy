package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName : hello.proxy.app.v1
 * fileName : OrderControllerV1
 * author : psjw
 * date : 2022-07-31
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-31        psjw         최초 생성
 */
@RequestMapping //스프링은  @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
@ResponseBody
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId); //@RequestParam("itemId") 없으면 컴파일시 컴파일이 안되는 경우 있음(자바 버전에 따라 다름)

   @GetMapping("/v1/no-log")
   String noLog();
}
