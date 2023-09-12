package template_method_pattern.after;

/**
 * 주식 매수 주문을 나타내는 클래스입니다.
 *
 * @author Lee Eunji
 */
public class BuyOrder extends AbstractOrder {

    private String stockSymbol;
    private int quantity;
    private double price;

    /**
     * BuyOrder 클래스의 생성자입니다.
     *
     * @param stockSymbol 주식 심볼
     * @param quantity    주문 수량
     * @param price       주문 가격
     */
    public BuyOrder(String stockSymbol, int quantity, double price) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * 매수 주문의 유효성을 검사하는 메소드입니다.
     */
    @Override
    public void validateOrder() {
        // 매수 주문 유효성 검사
        // 예: 계좌 잔고 확인, 주식 가격 확인 등
    }

    /**
     * 주식을 실제로 매수하는 로직을 수행하는 메소드입니다.
     */
    @Override
    public void placeOrder() {
        // 주식을 실제로 매수하는 로직
        // 예: 주식 거래소와 통신하여 주문 실행
    }

    /**
     * 매수 주문을 확정 처리하는 메소드입니다.
     */
    @Override
    public void confirmOrder() {
        // 매수 주문 확정 처리
        // 예: 주문 번호 발급, 거래 내역 저장 등
    }
}
