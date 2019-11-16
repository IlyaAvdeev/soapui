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

import com.eviware.soapui.model.project.Project;
import com.eviware.soapui.model.settings.Settings;
import com.eviware.soapui.support.PropertyChangeNotifier;

import javax.swing.ImageIcon;
import java.util.List;

/**
 * General behaviour for all soapui model items
 */
public interface ModelItem extends PropertyChangeNotifier {
    String NAME_PROPERTY = ModelItem.class.getName() + "@name";
    String ICON_PROPERTY = ModelItem.class.getName() + "@icon";
    String DESCRIPTION_PROPERTY = ModelItem.class.getName() + "@description";
    String LABEL_PROPERTY = ModelItem.class.getName() + "@label";

    String getName();

    String getId();

    ImageIcon getIcon();

    String getDescription();

    Settings getSettings();

    List<? extends ModelItem> getChildren();

    ModelItem getParent();

    /**
     * Gets the project that this ModelItem object is part of. If this model item is not part of a project,
     * e.g. if this is a {@code Workspace} object, an {@code UnsupportedOperationException} is thrown.
     *
     * @return The Project object that this ModelItem is a descendant of
     * @throws UnsupportedOperationException If this model item is not the descendant of a project
     */
    Project getProject();
}
