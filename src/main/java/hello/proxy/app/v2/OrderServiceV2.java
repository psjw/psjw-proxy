package hello.proxy.app.v2;

import hello.proxy.app.v1.OrderRepositoryV1;

/**
 * packageName : hello.proxy.app.v2
 * fileName : OrderServiceV2
 * author : psjw
 * date : 2022-08-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-07        psjw         최초 생성
 */
public class OrderServiceV2 {
    private final OrderRepositoryV2 orderRepository;

    public OrderServiceV2(OrderRepositoryV2 orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
