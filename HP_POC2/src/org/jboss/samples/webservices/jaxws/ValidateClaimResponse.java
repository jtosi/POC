
package org.jboss.samples.webservices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.2.6-patch-01
 * Mon Jul 18 14:37:36 CDT 2011
 * Generated source version: 2.2.6-patch-01
 */

@XmlRootElement(name = "validateClaimResponse", namespace = "http://webservices.samples.jboss.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateClaimResponse", namespace = "http://webservices.samples.jboss.org/")

public class ValidateClaimResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

