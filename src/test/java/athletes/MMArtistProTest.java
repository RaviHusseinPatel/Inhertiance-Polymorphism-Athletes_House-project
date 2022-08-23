package athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MMArtistProTest {

    private MMArtistPro mmArtistPro;


    @BeforeEach

    public void setUp() {mmArtistPro= new MMArtistPro("jones", true, 23-0);}

    @Test
    public void canTalkToCoach(){
        String expected= "I got KOd coach";
        String actual= mmArtistPro.talkToCoach();
        assertEquals (actual, expected);
    }

    @Test

    public void sayRecord(){
        String expected= "Hi my record is 23-0";
        String actual= "Hi my record is" + mmArtistPro.record;
    }

}
