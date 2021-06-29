package com.te.music.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name = "MusicFiles")
@XmlRootElement(name = "MusicInfo")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("MusicInfo")
public class MusicInfo {
	
	@Id
	@Column(name = "id")
	private Integer song_Id;
	
	@Column
	private String song_Title;
	
	@Column
	private String artist_Name;

	@Column
	private String album_Name;
	
	@Column
	private String song_Location;
	
	@Column
	private String Description;
	
	public Integer getSong_Id() {
		return song_Id;
	}

	public void setSong_Id(Integer song_Id) {
		this.song_Id = song_Id;
	}

	public String getSong_Title() {
		return song_Title;
	}

	public void setSong_Title(String song_Title) {
		this.song_Title = song_Title;
	}

	public String getArtist_Name() {
		return artist_Name;
	}

	public void setArtist_Name(String artist_Name) {
		this.artist_Name = artist_Name;
	}

	public String getAlbum_Name() {
		return album_Name;
	}

	public void setAlbum_Name(String album_Name) {
		this.album_Name = album_Name;
	}

	public String getSong_Location() {
		return song_Location;
	}

	public void setSong_Location(String song_Location) {
		this.song_Location = song_Location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}


}
