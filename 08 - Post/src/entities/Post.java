package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momment;
	private String titlle;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	public void setMomment(Date momment) {
		this.momment = momment;
	}
	public void setTitlle(String titlle) {
		this.titlle = titlle;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	public Date getMomment() {
		return momment;
	}
	public String getTitlle() {
		return titlle;
	}
	public String getContent() {
		return content;
	}
	public Integer getLikes() {
		return likes;
	}
	

	public Post(Date momment, String titlle, String content, Integer likes) {
		this.momment = momment;
		this.titlle = titlle;
		this.content = content;
		this.likes = likes;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titlle + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(dateFormat.format(momment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c: comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}	
}
