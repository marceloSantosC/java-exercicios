package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(dateFormat.parse("17/07/2018 21:02:02"), "Traveling to New Zeland", "I'm going to visit this wonderful country!",12);
		Comment comment1Post1 = new Comment("Have a nice trip");
		Comment comment2Post1 = new Comment("Wow that's awesome");
		post1.addComment(comment1Post1);
		post1.addComment(comment2Post1);
		
		Post post2 = new Post(dateFormat.parse("28/07/2018 23:14:18"), "Good nighT guys", "See you tomorrow", 5);
		Comment coment1Post2 = new Comment("Good night");
		Comment coment2Post2 = new Comment("May the Force be with you");
		post2.addComment(coment1Post2);
		post2.addComment(coment2Post2);
		
		System.out.println(post1);
		System.out.println(post2);
	}
}