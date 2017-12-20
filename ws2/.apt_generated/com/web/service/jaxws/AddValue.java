
package com.web.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addValue", namespace = "http://service.web.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addValue", namespace = "http://service.web.com/")
public class AddValue {

    @XmlElement(name = "arg0", namespace = "")
    private float arg0;

    /**
     * 
     * @return
     *     returns float
     */
    public float getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(float arg0) {
        this.arg0 = arg0;
    }

}
