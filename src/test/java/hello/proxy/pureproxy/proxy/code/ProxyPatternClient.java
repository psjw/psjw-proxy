package hello.proxy.pureproxy.proxy.code;

/**
 * packageName : hello.proxy.pureproxy.proxy.code
 * fileName : ProxyPatternClient
 * author : psjw
 * date : 2022-08-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-08-07        psjw         최초 생성
 */
public class ProxyPatternClient {
    private Subject subject;

    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute(){
        subject.operation();
    }
}
