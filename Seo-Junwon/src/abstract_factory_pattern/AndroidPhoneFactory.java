package abstract_factory_pattern;

/**
 * <p>
 * 휴대폰을 생성하는 기능이 정의된 PhoneFactory를 구현한 IPhoneFactory 클래스이다. <br>
 * 휴대폰을 생성하는 createPhone 메서드와, OS를 생성하는 CreateOS 메서드로 구성되어 있다. 
 * </p>
 * @author 서준원
 *
 */
public class AndroidPhoneFactory implements PhoneFactory{
    
	/**
	 * 휴대폰을 생성하는 createPhone 메서드 
	 * createOS 메서드를 호출해 휴대폰에 해당하는 OS를 설치.
	 * 
	 * @return : 생성한 IPhone 객체
	 */
	@Override
    public Phone createPhone() {
        OS os = createOS();
        os.installOS();
        return new AndroidPhone();
    }
	
	/**
     * OS를 생성하는 createOS 메서드 
     * AndroidPhone에 적합한 OS인 GoogleOS를 생성함.
     * 
     * @return : 생성한 GoogleOS 객체
     */
    @Override
    public OS createOS() {
        return new GoogleOS();
    }
}
