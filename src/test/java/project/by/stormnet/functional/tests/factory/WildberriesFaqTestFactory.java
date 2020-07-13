package project.by.stormnet.functional.tests.factory;

import org.testng.annotations.Factory;
import project.by.stormnet.functional.tests.WildberriesFaqFactoryTest;

public class WildberriesFaqTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new WildberriesFaqFactoryTest("Регистрация"), new WildberriesFaqFactoryTest("Оплата заказа"),
                new WildberriesFaqFactoryTest("Возврат товара")
        };
    }
}

