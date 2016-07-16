package com.test.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=1)
@Component
public class BeanImplOne implements BeanInterface {

}
