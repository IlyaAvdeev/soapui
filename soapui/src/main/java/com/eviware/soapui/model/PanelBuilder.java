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

package com.eviware.soapui.model;

import com.eviware.soapui.ui.desktop.DesktopPanel;

import java.awt.Component;

/**
 * Behaviour for building {@link ModelItem}-related UI panels
 * @see com.eviware.soapui.model.ModelItem
 */
public interface PanelBuilder<T extends ModelItem> {
    /**
     * Gets the existence of overview panel
     * (if there should be Properties & Custom Properties in the bottom left corner of SoapUI window)
     * NOTE: this method is not about "has panel been built or not". It' about if the panel
     * been instrumented/created.
     * @return true of false
     */
    boolean hasOverviewPanel();

    Component buildOverviewPanel(T modelItem);

    /**
     * Gets the existence of main UI window associated with the ModelItem
     * (typically it's true since there is sense to have a ModelItem and do not have a UI to configure it)
     * NOTE: this method is not about "has panel been built or not". It' about if the panel
     * been instrumented/created.
     * @return
     */
    boolean hasDesktopPanel();

    DesktopPanel buildDesktopPanel(T modelItem);
}
