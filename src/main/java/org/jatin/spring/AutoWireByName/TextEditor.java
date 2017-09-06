package org.jatin.spring.AutoWireByName;

public class TextEditor {
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private SpellChecker spellChecker;
    public TextEditor(){
        //for using DI via setters in TextEditorInnerBeans.xml
    }


    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
