package com.sda.spring.core.configs.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

    private SpellChecker spellChecker;

    //field injection is evil
    @Autowired
    private TextFormatter textFormatter;


    private ImageConverter imageConverter;


    //constructor injection
    @Autowired
    public TextEditor(SpellChecker newSpellChecker) {
        this.spellChecker = newSpellChecker;
    }

    //setter injection

    //tale a new image converter
    // and put it on the text editor
    //command vs query
    @Autowired
    public void setImageConverter(ImageConverter imageConverter) {
        this.imageConverter = imageConverter;
    }


}
