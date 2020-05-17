package Interface.impl;

import Interface.Languages;

public class Chinese implements Languages {
    public Chinese(){
        this.say();
    }
    @Override
    public void say() {
        System.out.println("你好!");
    }
}
