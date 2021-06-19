package design.patterns.factory.method.factory;

import design.patterns.factory.method.model.ApplePhone;
import design.patterns.factory.method.model.Phone;

public class ApplePhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
