package design.patterns.factory.method;

import design.patterns.factory.method.factory.PhoneFactory;
import design.patterns.factory.method.model.Phone;
import design.patterns.factory.method.model.WindowsPhone;

public class Main {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = Config.phoneFactoryByConfig("fancy");
        Phone expectedApple = phoneFactory.createPhone();
        expectedApple.showUi();

        phoneFactory = Config.phoneFactoryByConfig("flexible");
        Phone expectedAndroid = phoneFactory.createPhone();
        expectedAndroid.showUi();

        phoneFactory = Config.phoneFactoryByConfig("dead");
        Phone expectedWindowsPhone = phoneFactory.createPhone();
        expectedWindowsPhone.showUi();
    }
}
