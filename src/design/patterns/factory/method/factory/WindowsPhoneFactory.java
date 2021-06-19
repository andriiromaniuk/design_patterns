package design.patterns.factory.method.factory;

import design.patterns.factory.method.model.Phone;
import design.patterns.factory.method.model.WindowsPhone;

public class WindowsPhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone() {
        return new WindowsPhone();
    }
}
