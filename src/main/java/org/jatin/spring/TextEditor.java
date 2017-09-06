package org.jatin.spring;

public class TextEditor {
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
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TestEditor Constructor. ");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
