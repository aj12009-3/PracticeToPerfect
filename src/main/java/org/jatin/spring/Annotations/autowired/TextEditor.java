package org.jatin.spring.Annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    private SpellChecker spellChecker;
    public TextEditor(){
        //for usind DI via setters in TextEditorInnerBeans.xml
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
