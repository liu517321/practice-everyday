package Interface.impl;

import Interface.Languages;

public class English implements Languages {
    public English(){
        this.say();
    }
    @Override
    public void say() {
        System.out.println("Hello!");
    }
}
