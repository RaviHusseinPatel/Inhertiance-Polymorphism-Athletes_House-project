package athletes;

import Interfaces.ILearn;

public class MMArtistAmateur extends MMArtist implements ILearn {

    public MMArtistAmateur (String name, boolean fit, int record){

        super(name,fit,record);
    }

    public String talkToCoach() {return "Im scared of getting KOd coach";}

    public String learn (int timeLearning){
        return String.format("%s learnt for %s hours", this.name, timeLearning);
    }

}
