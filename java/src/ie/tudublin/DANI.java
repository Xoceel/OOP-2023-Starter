package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	String[] splits;
	String[] lines;
	Word[] words = new Word[10];
	ArrayList<Follow> fields;
	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {
		if(key == '0') {
		loadFile();
		printModel();
		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	int splitsCount;

	// above is orginial methods
	public void loadFile() {
		lines = loadStrings("small.txt"); // Load a text file into a String array]
		fields = new ArrayList<Follow>();

		for (int i = 0; i < lines.length; i++) {
			lines[i] = lines[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			lines[i] = lines[i].toLowerCase(); // Convert a string to lower case 
			splits = split(lines[i], ' '); // Split a string into an array of words
			for(int j = 0; j < splits.length; j ++) {
					words[j] = new Word(splits[j]);
			}

		}
	}


	public void printModel() {
		for(int i = 0; i < words.length; i++) {
			int x = 0;
			System.out.println(words.length);
			while (words[i].word != null && x == 0) {
				System.out.println(words[i].word);
				x = 1;

			}
		}
	}
	public boolean findWord(String str) {
		for (int i = 0; i < lines.length; i++) {
			if (str.equals(words[i].word)){
				return true;
			}
		}
		return false;
	}

}
