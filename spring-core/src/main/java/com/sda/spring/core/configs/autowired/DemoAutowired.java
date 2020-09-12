package com.sda.spring.core.configs.autowired;

public class DemoAutowired {

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker();
        TextEditor textEditor = new TextEditor(spellChecker);

    }

    private static void withoutSpring() {
        SpellChecker spellChecker = new SpellChecker();
        TextEditor textEditor = new TextEditor(spellChecker);

    }
}
