package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stage {
private List<String> stage=new ArrayList<String>();
private List<Passanger> passanger=new ArrayList<Passanger>();
private int cost=0;
private List<String> towns;

public Stage(List<String> stage) {
	this.stage = stage;
}
public Stage() {
}


public Stage(List<String> stage, List<Passanger> passanger) {
	super();
	this.stage = stage;
	this.passanger = passanger;
}


public int getCost() {
	return cost;
}


public int setCost(List<String> stage) {
	this.towns=stage;
	for(String t:towns) {
		
		if(t.matches("kathemboni")) {
			   cost=50;
		   }else if(t.matches("katoloni")) {
			   cost=100;
		   }else if(t.matches("kenyaIsrael")) {
			   cost=200;
		   }else if(t.matches("makutano")) {
				   cost=250;
		   }else System.out.println("Error:You chose an invalid town");
		   
	}
	return cost;

}

public List<String> Towns(){
	String []t= {"kathemboni","\n katoloni","\n makutano","\n kenyaIsrael"};
	towns=Arrays.asList(t);

	return towns;
	
}

public List<String> getStage() {
	return stage;
}
public void setStage(List<String> stage) {
	this.stage = stage;
}
public List<Passanger> getPassanger() {
	return passanger;
}
public void setPassanger(List<Passanger> passanger) {
	this.passanger = passanger;
}
@Override
public String toString() {
	return "Stage [stage=" + stage + ", passanger=" + passanger + "]";
}


}
