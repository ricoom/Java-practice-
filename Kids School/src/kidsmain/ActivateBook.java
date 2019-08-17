package kidsmain;

import java.util.Scanner;

public class ActivateBook {

	public static void main(String[] args) {
Book bk=new Book();
String choice;
Scanner input=new Scanner(System.in);
  String[] quizes= {"who was the mother of Jesus?\n[Charity,Elizabeth,Mary]",
		  "how many books does the Bible have?\n[66,50,42],",
		  "Where did the Noah's ark rest after floods?\n[mt ararat,mt kenya,river jordan]",
		  "Who betrayed Jesus?\n[noah,Judas,peter]",
		  "which is the first book in new testament?\n[leviticus,mathew,james,john]?"};
  String[] ans= {"66","mary","mt ararat","genesis","judas"};
     bk.addQuestions(quizes);
     bk.addAnswers(ans);
     
     for(String q:quizes) {
    	 
     System.out.println(q);
     choice=input.nextLine();
     bk.checkAns(choice);
	 System.out.println("Total marks\n"+bk.award());
     }
	}

}
