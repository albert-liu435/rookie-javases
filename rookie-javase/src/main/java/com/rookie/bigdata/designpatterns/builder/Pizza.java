package com.rookie.bigdata.designpatterns.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @ClassName Pizza
 * @Description Pizza
 * @Author
 * @Date 2020/4/15 17:09
 * @Version 1.0
 */
public abstract class Pizza {

    public enum Topping{HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        //存放枚举类型的对象
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}
