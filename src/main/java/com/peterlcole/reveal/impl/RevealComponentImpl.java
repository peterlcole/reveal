package com.peterlcole.reveal.impl;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import com.peterlcole.reveal.api.RevealComponent;

import javax.inject.Inject;
import javax.inject.Named;

@ExportAsService ({RevealComponent.class})
@Named ("revealComponent")
public class RevealComponentImpl implements RevealComponent
{
        @ComponentImport
        private final ApplicationProperties applicationProperties;

        @Inject
        public RevealComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "reveal:" + applicationProperties.getDisplayName();
        }
        
        return "reveal";
    }
}