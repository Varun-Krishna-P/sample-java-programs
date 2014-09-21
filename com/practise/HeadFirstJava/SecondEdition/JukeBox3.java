package com.practise.HeadFirstJava.SecondEdition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox3 {
	private BufferedReader reader;
	ArrayList<String> songsList = new ArrayList<String>();
	
	public static void main(String[] args) {
		new JukeBox3().go();
	}
	
	void go(){
		getSongs();
		System.out.println("Before sorting the songs\n"+songsList+"\n");
		Collections.sort(songsList);
		System.out.println(songsList);
	}
	
	void getSongs(){
		try {
			File file = new File("songs.txt");
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine())!=null) {
				addSongs(line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	void addSongs (String lineToParse){
		String[] tokens = lineToParse.split("/");
		songsList.add(tokens[0]);
	}
}
