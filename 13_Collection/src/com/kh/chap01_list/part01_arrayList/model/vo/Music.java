package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {

		private String name;
		private String song;
		
		public Music() {
			super();
		}
		public Music(String name, String song) {
			super();
			this.name = name;
			this.song = song;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSong() {
			return song;
		}
		public void setSong(String song) {
			this.song = song;
		}
		@Override
		public String toString() {
			return "Music [name=" + name + ", song=" + song + "]";
		}
		
		
		
}