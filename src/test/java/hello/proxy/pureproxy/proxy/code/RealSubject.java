package hello.proxy.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.proxy.pureproxy.proxy.code
 * fileName : RealSubject
 * author : psjw
 * date : 2022-08-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-07        psjw         최초 생성
 */
@Slf4j
public class RealSubject implements Subject{
    @Override
    public String operation() {
        log.info("실제 객체 호출");
        sleep(1000);
        return "data";
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
