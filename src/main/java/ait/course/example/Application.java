package tus.course.example;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		String[] separateWords=StringUtils.split(words, ' ');
		return (separateWords == null)? 0 : separateWords.length;
	}
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		for (String greeting: greetings){
			System.out.println("Greeting: "+greeting);
		}
	}
 
    public Application() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (final String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.println("Word Count: "+count);
    }
}