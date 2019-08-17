package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import data.Passanger;
import data.Stage;

public class Alight {
Scanner input=new Scanner(System.in);
Stage stage=new Stage();
Passanger pass=new Passanger();
List<String> destination=new ArrayList<String>();


public void SelectStage() {

	System.out.println("please enter your name");
	String passname=input.nextLine();
	pass.setName(passname);
	
	System.out.println("please enter your phone number");
	String passphone=input.nextLine();
	pass.setPhoneNumber(passphone);

	System.out.println("please choose a destination from this list:"+stage.Towns());
	
	String name=input.nextLine();
	destination.add(name);
	stage.setStage(destination);
	stage.setCost(destination);
	
String [] R= {("NAME:"+pass.getName()+"\n PHONE:"+pass.getPhoneNumber()+"\n DESTINATION"+stage.getStage()+"\n PAY:"+stage.getCost())};
   List<String> results=Arrays.asList(R);
   System.out.println(results);
}

public static void main(String[] args) {
	Alight al=new Alight();
	al.SelectStage();
}
}
