/*
 * SoapUI, Copyright (C) 2004-2019 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent 
 * versions of the EUPL (the "Licence"); 
 * You may not use this work except in compliance with the Licence. 
 * You may obtain a copy of the Licence at: 
 * 
 * http://ec.europa.eu/idabc/eupl 
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is 
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either 
 * express or implied. See the Licence for the specific language governing permissions and limitations 
 * under the Licence. 
 */

package com.eviware.soapui.ui.desktop;

import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.support.action.swing.ActionList;

import javax.swing.JComponent;

/**
 * Behaviour for a SoapUI Desktop implementation
 */

public interface SoapUIDesktop {
    boolean closeDesktopPanel(DesktopPanel desktopPanel);

    boolean hasDesktopPanel(ModelItem modelItem);

    void addDesktopListener(DesktopListener listener);

    void removeDesktopListener(DesktopListener listener);

    DesktopPanel showDesktopPanel(ModelItem modelItem);

    boolean closeDesktopPanel(ModelItem modelItem);

    ActionList getActions();

    DesktopPanel[] getDesktopPanels();

    DesktopPanel getDesktopPanel(ModelItem modelItem);

    DesktopPanel showDesktopPanel(DesktopPanel desktopPanel);

    JComponent getDesktopComponent();

    void transferTo(SoapUIDesktop newDesktop);

    boolean closeAll();

    void release();

    void init();

    void minimize(DesktopPanel desktopPanel);

    void maximize(DesktopPanel dp);

    void showInspector(JComponent component);
}
