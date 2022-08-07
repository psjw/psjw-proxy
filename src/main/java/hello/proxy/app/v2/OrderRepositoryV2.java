package hello.proxy.app.v2;

/**
 * packageName : hello.proxy.app.v2
 * fileName : OrderRepositoryV2
 * author : psjw
 * date : 2022-08-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-07        psjw         최초 생성
 */
public class OrderRepositoryV2 {
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
