//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.26 at 07:16:25 PM EEST 
//


package com.example.demo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lego" type="{http://example.com/legos}lego"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lego"
})
@XmlRootElement(name = "getLegoResponse")
public class GetLegoResponse {

    @XmlElement(required = true)
    protected Lego lego;

    /**
     * Gets the value of the lego property.
     * 
     * @return
     *     possible object is
     *     {@link Lego }
     *     
     */
    public Lego getLego() {
        return lego;
    }

    /**
     * Sets the value of the lego property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lego }
     *     
     */
    public void setLego(Lego value) {
        this.lego = value;
    }

}
