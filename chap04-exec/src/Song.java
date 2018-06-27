
public class Song {
	String title, artist, album;
	int year, track;

	public Song() {
	}

	public Song(String title, String artist, String album, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.track = track;
	}
	
	// 자동생성으로 필드를 뽑아주는 애
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + ", track="
				+ track + "]";
	}

	public static void main(String args[]) {
		Song song01 = new Song("Little Star", "스탠딩 에그", "Lucky", 2011, 5);
		Song song02 = new Song();
		song02.title = "선인장";
		song02.artist = "에피톤 프로젝트";
		song02.album = "유실물 보관소";
		song02.year = 2010;
		song02.track = 4;
		
		System.out.println(song01.toString());
		System.out.println(song02); 
		// 객체 참조 변수 인 경우 toString() 을 자동으로 호출함.그래서 미리 정의를 해 둬야함.
		// 미리 정의를 해 두지 않은경우,기본으로 가진 super class(object class)에 만들어진 
		// toString() 을 호출하는데 이 메서드는 어떤 클래스로부터 만들어졌고, 어디에 있는 애인지에 대한 정보 만 있음.
	}
}
