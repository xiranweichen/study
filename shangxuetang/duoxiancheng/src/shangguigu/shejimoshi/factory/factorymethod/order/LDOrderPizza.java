package shangguigu.shejimoshi.factory.factorymethod.order;

import shangguigu.shejimoshi.factory.factorymethod.pizza.LDCheesePizza;
import shangguigu.shejimoshi.factory.factorymethod.pizza.LDPepperPizza;
import shangguigu.shejimoshi.factory.factorymethod.pizza.Pizza;

/**
 * @description:
 * @date: 2020/6/8 19:56
 * @author: lizhenhong
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
