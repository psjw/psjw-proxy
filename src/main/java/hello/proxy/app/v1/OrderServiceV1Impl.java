package hello.proxy.app.v1;

/**
 * packageName : hello.proxy.app.v1
 * fileName : OrderServiceV1Impl
 * author : psjw
 * date : 2022-07-31
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-31        psjw         최초 생성
 */
public class OrderServiceV1Impl implements OrderServiceV1{
    private final OrderRepositoryV1 orderRepository;


    public OrderServiceV1Impl(OrderRepositoryV1 orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
