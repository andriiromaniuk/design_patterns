package design.patterns.factory.method;

import design.patterns.factory.method.factory.AndroidPhoneFactory;
import design.patterns.factory.method.factory.ApplePhoneFactory;
import design.patterns.factory.method.factory.PhoneFactory;
import design.patterns.factory.method.factory.WindowsPhoneFactory;

public class Config {
    static PhoneFactory phoneFactoryByConfig(String config) {
        if (config.equals("fancy")) {
            return new ApplePhoneFactory();
        } else if (config.equals("flexible")) {
            return new AndroidPhoneFactory();
        } else if (config.equals("dead")) {
            return new WindowsPhoneFactory();
        } else {
            throw new RuntimeException("Uknown config setting");
        }
    }
}
