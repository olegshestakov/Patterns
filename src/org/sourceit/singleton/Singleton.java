package org.sourceit.singleton;

public enum Singleton {

    INSTANCE;

    public void showMessage() {
        System.out.println("Inside Singleton::showMesage");
    }

}
