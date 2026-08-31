package com.tns.interfaceprogram;

interface TechnicalRole{
	void designArchitecture();
}

interface ManagementRole{
	void manageTeam();
}

class ProjectManager implements TechnicalRole,ManagementRole{
  
	private String name;
	private String projectName;
	private int teamsize;
	private double projectBudget;
	
	  
	public ProjectManager(String name, String projectManmager, int teamsize, double projectBudget) {
		super();
		this.name = name;
		this. projectName = projectName;
		this.teamsize = teamsize;
		this.projectBudget = projectBudget;
	}

	@Override
	public void manageTeam() {
	System.out.println("Managing a team of " + teamsize + "Developers....");
		
	}

	@Override
	public void designArchitecture() {
   System.out.println(name + " is a architectuire for " + name);
		
	}
	
	void checkBudget() {
		if(projectBudget>100000) {
			System.out.println("High budget project....");
		} else {
			System.out.println("Low budget project...");
		}
	}
	
	void displayProjectDetails() {
		System.out.println("projerct details...");
		System.out.println("Manager Name : " + name);
		System.out.println("Project " + projectName);
		System.out.println("Team : " + teamsize);
		System.out.println("Budget : " + projectBudget);
	}
}

public class Organization {
public static void main(String[] args) {
	ProjectManager projectManager = new ProjectManager("Thanvi", "E-commerce", 56, 5666);
	projectManager.checkBudget();
	projectManager.displayProjectDetails();
}
}
