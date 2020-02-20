import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TelephoneTest{
    @Test
    public void ChallengeX(){
        assertEquals("(570)322-3128", Telephone.format("5703223128"));
    }
}