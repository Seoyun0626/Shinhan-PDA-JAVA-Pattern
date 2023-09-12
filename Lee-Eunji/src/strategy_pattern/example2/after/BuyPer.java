package strategy_pattern.example2.after;

/**
 * PER를 기반으로 매수하는 전략을 구현한 클래스입니다.
 *
 * @author Lee Eunji
 */
public class BuyPer implements BuyStrategy {
    @Override
    public void buy() {
        System.out.println("by PER");
    }
}
