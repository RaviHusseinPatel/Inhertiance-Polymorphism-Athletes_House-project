package athletes;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballerTest {

    private Footballer footballer;

    @BeforeEach

    public void setUp() {footballer= new Footballer("messi", true)}

    @Test
    public void canTalkToCoach(){
        String expected= "the football pitch is wet";
        String actual = footballer.talkToCoach();
        assertEquals (expected, actual);
    }


}
