package lambdas;

import java.util.ArrayList;

// 我们可以在任意函数式接口上使用@FunctionalInterface注解，这样做可以检查它是否是一个函数式接口。
// 同时javadoc也会包含一条声明，说明这个接口是一个函数式接口。
@FunctionalInterface
public interface FunInterface {

    void pp( ArrayList<?>...allArgs );

}
