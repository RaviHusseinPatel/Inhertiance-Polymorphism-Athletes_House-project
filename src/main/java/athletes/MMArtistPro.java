package athletes;

public class MMArtistPro extends MMArtist{

    public MMArtistPro (String name, boolean fit, int record) {
        super(name,fit, record);
    }

    @Override

    public String talkToCoach() {return "I got KOd coach";}

    public String sayRecord() {return String.format("hi my record is %o/l", this.record);}
}
