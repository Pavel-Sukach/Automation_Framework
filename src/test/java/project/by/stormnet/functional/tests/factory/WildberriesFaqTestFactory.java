package project.by.stormnet.functional.tests.factory;

import org.testng.annotations.Factory;
import project.by.stormnet.functional.tests.WildberriesFaqFactoryTests;

public class WildberriesFaqTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new WildberriesFaqFactoryTests("Регистрация"), new WildberriesFaqFactoryTests("Оплата заказа"),
                new WildberriesFaqFactoryTests("Возврат товара")
        };
    }
}

