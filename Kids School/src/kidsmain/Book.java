package kidsmain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Book {
private int marks=0;	
private List<String> questions;
private List<String> Answers;

public void addQuestions(String [] quizes) {
	questions=new ArrayList<String>();
    questions.addAll(Arrays.asList(quizes));
}
public void addAnswers(String[] answers) {
	Answers=new ArrayList<String>();
	Answers.addAll(Arrays.asList(answers));
}
public void checkAns(String choice) {
	if(Answers.contains(choice)) {
		System.out.println("correct");
		Answers.remove(choice);
		marks+=5;
	}else System.out.println("wrong");

}
public int award() {
	return marks;
}
}
