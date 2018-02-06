package com.dmn.exchangerates;

public class Currency {

private String shortcut;
private String value;

public Currency(String shortcut, String value) {
        this.shortcut = shortcut;
        this.value = value;
}

public String getShortcut() {
        return shortcut;
}

public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
}

public String getValue() {
        return value;
}

public void setValue(String value) {
        this.value = value;
}

}
