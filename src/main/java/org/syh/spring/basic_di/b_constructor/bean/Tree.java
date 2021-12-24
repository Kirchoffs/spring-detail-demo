package org.syh.spring.basic_di.b_constructor.bean;

public class Tree {
    private String leaf;
    private String flower;
    public Tree(String leaf, String flower) {
        this.leaf = leaf;
        this.flower = flower;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaf='" + leaf + '\'' +
                ", flower='" + flower + '\'' +
                '}';
    }
}
