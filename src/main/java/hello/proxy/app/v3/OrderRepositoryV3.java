package hello.proxy.app.v3;

import org.springframework.stereotype.Repository;

/**
 * packageName : hello.proxy.app.v3
 * fileName : OrderRepositoryV3
 * author : psjw
 * date : 2022-08-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-07        psjw         최초 생성
 */
@Repository
public class OrderRepositoryV3 {
    public void save(String itemId) {
        //저장로직
        if(itemId.equals("ex")){
            throw new IllegalStateException("예외발생");
        }
        sleep(100);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
