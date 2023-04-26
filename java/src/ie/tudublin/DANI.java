package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	String[] splits;
	String[] lines;
	Word[] words;
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


	// above is orginial methods
	public void loadFile() {
		lines = loadStrings("small.txt"); // Load a text file into a String array]
		fields = new ArrayList<Follow>();
		for (int i = 0; i < lines.length; i++) {
			lines[i] = lines[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			lines[i] = lines[i].toLowerCase(); // Convert a string to lower case 
			splits = split(lines[i], ' '); // Split a string into an array of words
			for(int j = 0; j < splits.length; j ++) {

				while(!findWord(splits[j])) {
					fields.get(i).word = splits[j+1];
					fields.get(i).count++;

					words[j] = new Word(splits[j], fields);
				}
			}

		}
	}


	public void printModel() {
		for(int i = 0; i < splits.length; i++) {
			System.out.println(splits[i]);
		}
	}
	public boolean findWord(String str) {
		for (int i = 0; i < words.length; i++) {
			if (str.equals(words[i].word)){
				return true;
			}
		}
		return false;
	}

}
