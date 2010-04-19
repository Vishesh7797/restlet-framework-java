/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package org.restlet.ext.sip;

import org.restlet.data.Form;
import org.restlet.data.Parameter;
import org.restlet.data.Reference;
import org.restlet.util.Series;

/**
 * Address of a SIP agent. Used by the SIP "Alert-Info", "Contact",
 * "Error-info", "From", "Record-Route", "Reply-To", "Route" and "To" headers.
 * 
 * @author Thierry Boileau
 */
public class Address {

    /** The optional name displayed. */
    private String displayName;

    /** The list of generic parameters. */
    private Series<Parameter> parameters;

    /** The address reference. */
    private Reference reference;

    /**
     * Returns the optional name displayed.
     * 
     * @return The optional name displayed.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Returns the list of generic parameters.
     * 
     * @return The list of generic parameters.
     */
    public Series<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new Form();
        }
        return parameters;
    }

    /**
     * Returns the address reference.
     * 
     * @return The address reference.
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the optional name displayed.
     * 
     * @param displayName
     *            The optional name displayed.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets the list of generic parameters.
     * 
     * @param parameters
     *            The list of generic parameters.
     */
    public void setParameters(Series<Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * Sets the address reference.
     * 
     * @param reference
     *            The address reference.
     */
    public void setReference(Reference reference) {
        this.reference = reference;
    }

}
