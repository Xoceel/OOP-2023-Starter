package ie.tudublin;

import java.util.ArrayList;

public class Word {
    String word;
    ArrayList<Follow> fields;

    public Word(String word, ArrayList<Follow> fields) {
        this.word = word;
        this.fields = fields;
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getfields() {
        return fields;
    }

    public void setfields(ArrayList<Follow> fields) {
        this.fields = fields;
    }

    // @Override
    // public String toString() {
    //     continue
    // }
}
