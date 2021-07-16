package ut.com.peterlcole.reveal;

import org.junit.Test;
import com.peterlcole.reveal.api.RevealComponent;
import com.peterlcole.reveal.impl.RevealComponentImpl;

import static org.junit.Assert.assertEquals;

public class RevealComponentUnitTest
{
    @Test
    public void testMyName()
    {
        RevealComponent component = new RevealComponentImpl(null);
        assertEquals("names do not match!", "reveal",component.getName());
    }
}