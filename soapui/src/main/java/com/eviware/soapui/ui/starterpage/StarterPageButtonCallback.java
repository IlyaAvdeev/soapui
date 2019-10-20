package com.eviware.soapui.ui.starterpage;

import com.eviware.soapui.impl.WorkspaceImpl;
import com.eviware.soapui.impl.actions.NewRestProjectAction;
import com.eviware.soapui.impl.actions.NewWsdlProjectAction;
import com.eviware.soapui.model.workspace.Workspace;

import javax.swing.SwingUtilities;

public class StarterPageButtonCallback {

    public static String CALLBACK = "buttonCallback";

    private WorkspaceImpl workspace;

    public StarterPageButtonCallback(Workspace workspace) {
        this.workspace = (WorkspaceImpl) workspace;
    }

    public void createSoapProject() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewWsdlProjectAction().perform(workspace, null);
            }
        });
    }

    public void createRestProject() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewRestProjectAction().perform(workspace, null);
            }
        });
    }
}
