/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.autoscale.models;

import java.util.ArrayList;

/**
* Autoscale setting.
*/
public class AutoscaleSetting
{
    private boolean enabled;
    
    /**
    * @return The Enabled value.
    */
    public boolean isEnabled()
    {
        return this.enabled;
    }
    
    /**
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final boolean enabledValue)
    {
        this.enabled = enabledValue;
    }
    
    private ArrayList<AutoscaleProfile> profiles;
    
    /**
    * @return The Profiles value.
    */
    public ArrayList<AutoscaleProfile> getProfiles()
    {
        return this.profiles;
    }
    
    /**
    * @param profilesValue The Profiles value.
    */
    public void setProfiles(final ArrayList<AutoscaleProfile> profilesValue)
    {
        this.profiles = profilesValue;
    }
    
    /**
    * Initializes a new instance of the AutoscaleSetting class.
    *
    */
    public AutoscaleSetting()
    {
        this.profiles = new ArrayList<AutoscaleProfile>();
    }
}