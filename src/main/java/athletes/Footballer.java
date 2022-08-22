package athletes;

public class Footballer extends Athlete {

    private boolean canWaitToScore;

    public Footballer (String name, boolean canWaitToScore){
        super(name);
        this.canWaitToScore=canWaitToScore;
    }

    @Override
    public String talkToCoach() {return "the football pitch is wet";}
}
