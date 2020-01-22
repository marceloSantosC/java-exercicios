package entities;

public class Comment {
	public Comment(String comment) {
		this.text = comment;
	}
	private String text;

	public String getText() {
		return text;
	}
	public String toString() {
		return String.format("%n",text);
	}
	
}
