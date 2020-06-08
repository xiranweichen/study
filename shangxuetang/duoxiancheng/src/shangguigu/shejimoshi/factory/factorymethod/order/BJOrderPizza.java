package shangguigu.shejimoshi.factory.factorymethod.order;

import shangguigu.shejimoshi.factory.factorymethod.BJCheesePizza;
import shangguigu.shejimoshi.factory.factorymethod.BJPepperPizza;
import shangguigu.shejimoshi.factory.factorymethod.Pizza;

/**
 * @description: 北京的pizza订购
 * @date: 2020/6/8 19:52
 * @author: lizhenhong
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        } else {
            pizza = new Pizza() {
                @Override
                public void prepare() {
                    System.out.println("重新输入");
                }
            };
        }
        return pizza;

    }
}
