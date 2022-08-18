package hello.proxy.pureproxy.concreteproxy.code;

/**
 * packageName : hello.proxy.pureproxy.concreteproxy.code
 * fileName : ConcreteClient
 * author : psjw
 * date : 2022-08-18
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-18        psjw         최초 생성
 */
public class ConcreteClient {
    private ConcreteLogic concreteLogic; //ConcreteLogic, TimeProxy 모두 할당 가능

    public ConcreteClient(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;

    }

    public void execute() {
        concreteLogic.operation();
    }
}
