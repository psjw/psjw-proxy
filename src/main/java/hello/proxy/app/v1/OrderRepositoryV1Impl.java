package hello.proxy.app.v1;

/**
 * packageName : hello.proxy.app.v1
 * fileName : OrderRepositoryV1Impl
 * author : psjw
 * date : 2022-07-31
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-31        psjw         최초 생성
 */
public class OrderRepositoryV1Impl implements OrderRepositoryV1{
    @Override
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
