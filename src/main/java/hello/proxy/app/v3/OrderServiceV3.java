package hello.proxy.app.v3;

import hello.proxy.app.v2.OrderRepositoryV2;
import org.springframework.stereotype.Service;

/**
 * packageName : hello.proxy.app.v3
 * fileName : OrderServiceV3
 * author : psjw
 * date : 2022-08-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-07        psjw         최초 생성
 */
@Service
public class OrderServiceV3 {
    private final OrderRepositoryV3 orderRepository;

    public OrderServiceV3(OrderRepositoryV3 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
