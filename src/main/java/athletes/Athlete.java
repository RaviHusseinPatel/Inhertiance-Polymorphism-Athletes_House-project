package athletes;

public  abstract class Athlete {

    public String name;
//    as we know our athletes class will become abstract, we don't
//    need a String for different sports they play, as they'll have
//    their own individual classes.
    private boolean fit;

    // After creating our variables, we create a constructor:

    public Athlete (String name, boolean fit){
        this.name=name;
        this.fit=true;
    }

    // Now let's add our getters and setters

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public boolean isFit() {return fit;}
    public void setFit(boolean fit){this.fit=fit;}

    public String talkToCoach() {
        return String.format("coach %d. ", this.name + "needs help");
    }

    public String eat(){return "getting energy";}
}
