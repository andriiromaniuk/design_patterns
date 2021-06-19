package design.patterns.factory.method.factory;

import design.patterns.factory.method.model.AndroidPhone;
import design.patterns.factory.method.model.Phone;

public class AndroidPhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }
}
