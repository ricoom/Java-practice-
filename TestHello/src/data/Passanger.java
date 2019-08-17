package data;

import java.util.List;

public class Passanger {
private String name=null;
private String phoneNumber;
private List<Stage> stage;


public Passanger(String name, String phoneNumber, List<Stage> stage) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.stage = stage;
}


public Passanger(String name, String phoneNumber) {
	this.name = name;
	this.phoneNumber = phoneNumber;
}


public Passanger() {
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public List<Stage> getStage() {
	return stage;
}
public void setStage(List<Stage> stage) {
	this.stage = stage;
}


@Override
public String toString() {
	return "Passanger [name=" + name + ", phoneNumber=" + phoneNumber + ", stage=" + stage + "]";
}


}
