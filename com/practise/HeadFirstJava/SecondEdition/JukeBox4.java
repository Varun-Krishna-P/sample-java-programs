package com.practise.HeadFirstJava.SecondEdition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox4 {
	private BufferedReader reader;
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		new JukeBox4().go();
	}
	
	void go() {
		getSongs();
		System.out.println(songList);
//		Collections.sort(songList);
		System.out.println(songList);
	}
	
	void getSongs(){
		try {
			File file = new File("songs1.txt");
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine())!=null) {
				addSong(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	void addSong (String lineToParse){
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
