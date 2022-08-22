package Workspace;

import athletes.Athlete;

import java.util.ArrayList;

public class Workspace {

    private String name;
    private ArrayList<Athlete> athletes;

    public Workspace (String name){

        this.name=name;
        this.athletes=new ArrayList<>();
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public ArrayList<Athlete> getAthletes(){return athletes;}
    public void setAthletes (ArrayList<Athlete>athletes){
        this.athletes=athletes;
    }

    public int countAthletes () {return this.athletes.size();}
    public void addAthlete (Athlete athlete) {this.athletes.add(athlete);}

}
