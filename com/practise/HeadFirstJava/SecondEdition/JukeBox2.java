package com.practise.HeadFirstJava.SecondEdition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeSet;

public class JukeBox2 {
	//private field
	private BufferedReader reader;
	TreeSet<String> songList = new TreeSet<String>();
	
	public static void main(String[] args) {
		new JukeBox2().go();
	}
	
	void go(){
		getSongs();
		System.out.println(songList);
	}
	
	void getSongs(){
		try {
			File file = new File ("songs.txt");
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
		songList.add(tokens[0]);
	}

}
