//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.rs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}OptionalFeaturesSupported"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalFeaturesSupported"
})
@XmlRootElement(name = "RegistryProfile")
public class RegistryProfile {

    @XmlElement(name = "OptionalFeaturesSupported", required = true)
    protected OptionalFeaturesSupported optionalFeaturesSupported;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the optionalFeaturesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalFeaturesSupported }
     *     
     */
    public OptionalFeaturesSupported getOptionalFeaturesSupported() {
        return optionalFeaturesSupported;
    }

    /**
     * Sets the value of the optionalFeaturesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalFeaturesSupported }
     *     
     */
    public void setOptionalFeaturesSupported(OptionalFeaturesSupported value) {
        this.optionalFeaturesSupported = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
