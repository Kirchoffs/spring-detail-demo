package org.syh.spring.bean.b_scope.bean;

import org.syh.spring.bean.b_scope.bean.Toy;

public class Child {
    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return  "Child{" +
                "toy=" + toy +
                '}';
    }
}
