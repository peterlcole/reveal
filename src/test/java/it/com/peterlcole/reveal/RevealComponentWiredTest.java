package it.com.peterlcole.reveal;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import com.peterlcole.reveal.api.RevealComponent;
import com.atlassian.sal.api.ApplicationProperties;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class RevealComponentWiredTest
{
    private final ApplicationProperties applicationProperties;
    private final RevealComponent RevealComponent;

    public RevealComponentWiredTest(ApplicationProperties applicationProperties,RevealComponent RevealComponent)
    {
        this.applicationProperties = applicationProperties;
        this.RevealComponent = RevealComponent;
    }

    @Test
    public void testMyName()
    {
        assertEquals("names do not match!", "revealComponent:" + applicationProperties.getDisplayName(),RevealComponent.getName());
    }
}